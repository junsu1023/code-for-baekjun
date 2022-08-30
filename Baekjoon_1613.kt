import kotlin.math.min

private lateinit var arr: Array<IntArray>
private const val INF = 987654321

fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    arr = Array(n + 1) { IntArray(n + 1) }

    for(i in 1 until n + 1) {
        for(j in 1 until n + 1) {
            if(i == j) arr[i][j] = 0
            else arr[i][j] = INF
        }
    }

    repeat(k) {
        val (accident1, accident2) = readLine().split(" ").map { it.toInt() }
        arr[accident1][accident2] = 1
    }

    floyd(n)

    val wantKnow = readLine().toInt()
    repeat(wantKnow) {
        val (before, after) = readLine().split(" ").map { it.toInt() }

        if(arr[before][after] == INF && arr[after][before] == INF) println(0)
        else if(arr[before][after] != INF) println(-1)
        else if(arr[after][before] != INF) println(1)
    }
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