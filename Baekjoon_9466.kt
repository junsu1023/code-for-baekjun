private lateinit var visited: BooleanArray
private lateinit var isCycle: BooleanArray
private lateinit var wantTeam: IntArray
private var cnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        visited = BooleanArray(n)
        isCycle = BooleanArray(n)

        wantTeam = readLine().split(" ").map { it.toInt() - 1 }.toIntArray()

        for(i in 0 until n) {
            if(!visited[i]) linkTeam(i)
        }

        println(n - cnt)
        cnt = 0
    }
}

private fun linkTeam(human: Int) {
    visited[human] = true
    var nextHuman = wantTeam[human]

    if(!visited[nextHuman]) linkTeam(nextHuman)
    else if(!isCycle[nextHuman]) {
        while(nextHuman != human) {
            nextHuman = wantTeam[nextHuman]
            cnt++
        }
        cnt++
    }
    isCycle[human] = true
}