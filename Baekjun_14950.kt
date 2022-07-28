import java.util.*
import kotlin.collections.ArrayList

private lateinit var visited: BooleanArray
private lateinit var edge: Array<ArrayList<Pair<Int, Int>>>

data class Move(val node: Int, val cost: Int): Comparable<Move> {
    override fun compareTo(other: Move): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val (nodeCnt, edgeCnt, increaseCost) = readLine().split(" ").map { it.toInt() }
    visited = BooleanArray(nodeCnt + 1)
    edge = Array(nodeCnt + 1) { ArrayList() }

    repeat(edgeCnt) {
        val (start, end, cost) = readLine().split(" ").map { it.toInt() }
        edge[start].add(Pair(end, cost))
        edge[end].add(Pair(start, cost))
    }

    println(prim(increaseCost))
}

private fun prim(increaseCost: Int): Long {
    var ans = 0L
    var conquer = 0
    var cnt = 0
    val pq = PriorityQueue<Move>()
    pq.add(Move(1, 0))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        if(visited[cur.node]) continue

        conquer++
        visited[cur.node] = true

        if(conquer > 2) cnt++
        ans += cur.cost + cnt * increaseCost

        for(i in edge[cur.node].indices) {
            if(!visited[edge[cur.node][i].first]) pq.add(Move(edge[cur.node][i].first, edge[cur.node][i].second))
        }
    }

    return ans
}