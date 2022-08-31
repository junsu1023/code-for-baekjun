import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

private lateinit var visitedCost: IntArray
private lateinit var parent: IntArray

data class Info(val from: Int, val to: Int, val cost: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val (countryCnt, roadCnt) = readLine().split(" ").map { it.toInt() }

    visitedCost = IntArray(countryCnt + 1)
    parent = IntArray(countryCnt + 1) { i -> i }

    var minCost = Integer.MAX_VALUE
    repeat(countryCnt) { i ->
        visitedCost[i + 1] = readLine().toInt()
        minCost = min(minCost, visitedCost[i+1])
    }

    val pq = PriorityQueue<Info>()
    repeat(roadCnt) {
        val (from, to, cost) = readLine().split(" ").map { it.toInt() }
        pq.add(Info(from, to, visitedCost[from] + visitedCost[to] + 2 * cost))
    }

    var ans = 0
    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        if(find(cur.from) != find(cur.to)) {
            union(cur.from, cur.to)
            ans += cur.cost
        }
    }

    println(ans + minCost)
}

private fun union(a: Int, b: Int) {
    val aRoot = find(a)
    val bRoot = find(b)

    if(aRoot < bRoot) parent[bRoot] = aRoot
    else parent[aRoot] = bRoot
}

private fun find(node: Int): Int {
    if(parent[node] != node) parent[node] = find(parent[node])
    return parent[node]
}