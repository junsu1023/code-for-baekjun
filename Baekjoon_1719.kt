import kotlin.collections.ArrayList
import kotlin.math.min

data class Route(val node: Int, val cost: Int): Comparable<Route> {
    override fun compareTo(other: Route): Int = cost - other.cost
}

private lateinit var arr: Array<IntArray>
private lateinit var path: Array<IntArray>
private const val INF = 987654321

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }

    arr = Array(n + 1) { IntArray(n + 1) { INF } }
    path = Array(n + 1) { IntArray(n + 1) }

    repeat(n + 1) { i ->
        repeat(n + 1) { j ->
            if(i == j) arr[i][j] = 0
        }
    }

    repeat(m) {
        val (from, to, cost) = readLine().split(" ").map { it.toInt() }
        arr[from][to] = cost
        arr[to][from] = cost
        path[from][to] = to
        path[to][from] = from
    }

    floyd(n)

    for(i in 1 .. n) {
        for(j in 1 .. n) {
            if(path[i][j] != 0) print("${path[i][j]} ")
            else print("- ")
        }
        println()
    }
}

private fun floyd(n: Int) {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                if(arr[i][j] > arr[i][k] + arr[k][j]) {
                    arr[i][j] = arr[i][k] + arr[k][j]
                    path[i][j] = path[i][k]
                }
            }
        }
    }
}