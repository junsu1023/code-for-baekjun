import java.util.*

data class w(val start: Int, val end: Int, val cost: Int): Comparable<w> {
    override fun compareTo(other: w): Int = cost - other.cost
}

private lateinit var parent: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val (nodeCnt, edgeCnt) = readLine().split(" ").map { it.toInt() }

    parent = IntArray(nodeCnt + 1)
    repeat(nodeCnt) { i -> parent[i] = i }

    val pq = PriorityQueue<w>()
    var totalCost = 0L
    repeat(edgeCnt) {
        val (start, end, cost) = readLine().split(" ").map { it.toInt() }
        totalCost += cost
        pq.add(w(start, end, cost))
    }

    var minCost = 0L
    var cnt = 0
    repeat(edgeCnt) {
        val cur = pq.poll()
        if(find(cur.start) != find(cur.end)) {
            union(cur.start, cur.end)
            minCost += cur.cost
            cnt++
        }
    }

    if(cnt != nodeCnt - 1) println(-1)
    else println(totalCost - minCost)
}

private fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)

    parent[bParent] = aParent
}

private fun find(i: Int): Int {
    if(parent[i] != i) parent[i] = find(parent[i])
    return parent[i]
}