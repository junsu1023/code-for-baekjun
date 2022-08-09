private const val INF = 100000000
private lateinit var map: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (v, e) = readLine().split(" ").map { it.toInt() }
    map = Array(v + 1) { IntArray(v + 1) { INF } }

    repeat(e) {
        val (start, end, dist) = readLine().split(" ").map { it.toInt() }
        map[start][end] = dist
    }

    floyd(v)

    var ans = INF
    for(i in 1 .. v) {
        for(j in 1 .. v) {
            if(i == j) continue
            if(map[i][j] != INF && map[j][i] != INF) {
                ans = minOf(ans, map[i][j] + map[j][i])
            }
        }
    }

    if(ans == INF) println(-1)
    else println(ans)
}

private fun floyd(n: Int) {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                map[i][j] = minOf(map[i][j], map[i][k] + map[k][j])
            }
        }
    }
}