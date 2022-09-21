import kotlin.math.min

private lateinit var arr: Array<IntArray>
private const val INF = 987654321

fun main() = with(System.`in`.bufferedReader()) {
    val (userCnt, relationCnt) = readLine().split(" ").map { it.toInt() }
    arr = Array(userCnt + 1) { IntArray(userCnt + 1) { INF } }

    for(i in 1 .. userCnt) {
        for(j in 1 .. userCnt) {
            if(i == j) arr[i][j] = 0
        }
    }

    repeat(relationCnt) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        arr[a][b] = 1
        arr[b][a] = 1
    }

    floyd(userCnt)

    var min = Integer.MAX_VALUE
    var user = 0
    for(i in 1 .. userCnt) {
        var sum = 0
        for(j in 1 .. userCnt) {
            sum += arr[i][j]
        }

        if(min > sum) {
            min = sum
            user = i
        }
    }

    println(user)
}

private fun floyd(n: Int) {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                arr[i][j] = min(arr[i][j], arr[i][k] + arr[k][j])
            }
        }
    }
}