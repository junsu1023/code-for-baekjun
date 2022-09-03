import kotlin.math.max
import kotlin.math.min

private lateinit var member: Array<IntArray>
private const val INF = 987654321

fun main() = with(System.`in`.bufferedReader()) {
    val memberCnt = readLine().toInt()

    member = Array(memberCnt + 1) { IntArray(memberCnt + 1) { INF } }
    for(i in 1 .. memberCnt) {
        for(j in 1 .. memberCnt) {
            if(i == j) member[i][j] = 0
        }
    }

    while(true) {
        val (member1, member2) = readLine().split(" ").map { it.toInt() }
        if(member1 == -1 && member2 == -1) break

        member[member1][member2] = 1
        member[member2][member1] = 1
    }

    floyd(memberCnt)

    var min = Integer.MAX_VALUE
    val candidate = ArrayList<Int>()

    for(i in 1 .. memberCnt) {
        var max = Integer.MIN_VALUE
        for(j in 1 .. memberCnt) {
            max = max(max, member[i][j])
        }

        if(max < min) {
            min = max
            candidate.clear()
            candidate.add(i)
        }
        else if(max == min) candidate.add(i)
    }

    println("$min ${candidate.size}")
    candidate.forEach { print("$it ") }
}

private fun floyd(n: Int) {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                member[i][j] = min(member[i][j], member[i][k] + member[k][j])
            }
        }
    }
}