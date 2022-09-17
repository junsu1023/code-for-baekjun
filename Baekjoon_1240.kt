import kotlin.math.min

private lateinit var arr: Array<IntArray>
private const val INF = 987654321

fun main() = with(System.`in`.bufferedReader()) {
    val (nodeCnt, pairCnt) = readLine().split(" ").map { it.toInt() }

    arr = Array(nodeCnt + 1) { IntArray(nodeCnt + 1) { INF } }

    repeat(nodeCnt - 1) {
        val (node1, node2, distance) = readLine().split(" ").map { it.toInt() }
        arr[node1][node2] = distance
        arr[node2][node1] = distance
    }

    floyd(nodeCnt)

    repeat(pairCnt) {
        val (node1, node2) = readLine().split(" ").map { it.toInt() }
        println(arr[node1][node2])
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