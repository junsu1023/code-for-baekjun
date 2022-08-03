import java.util.*
import kotlin.collections.ArrayList

data class EdgeInfo(val node: Int, val cost: Int): Comparable<EdgeInfo> {
    override fun compareTo(other: EdgeInfo): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val (nodeCnt, edgeCnt) = readLine().split(" ").map { it.toInt() }
    val startNode = readLine().toInt()

    val graph = Array(nodeCnt + 1) { ArrayList<Pair<Int, Int>>() }
    repeat(edgeCnt) {
        val (from, to, cost) = readLine().split(" ").map { it.toInt() }
        graph[from].add(Pair(to, cost))
    }

    val cost = dijkstra(startNode, nodeCnt, graph)

    repeat(nodeCnt) { i ->
        if(cost[i+1] == Int.MAX_VALUE) println("INF")
        else println(cost[i+1])
    }
}

private fun dijkstra(start: Int, n: Int, graph: Array<ArrayList<Pair<Int, Int>>>): IntArray {
    val pq = PriorityQueue<EdgeInfo>()
    pq.add(EdgeInfo(start, 0))

    val cost = IntArray(n + 1) { Int.MAX_VALUE }
    cost[start] = 0

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curNode = cur.node
        val curCost = cur.cost

        for(i in graph[curNode].indices) {
            val nextNode = graph[curNode][i].first
            val nextCost = curCost + graph[curNode][i].second

            if(nextCost < cost[nextNode]) {
                cost[nextNode] = nextCost
                pq.add(EdgeInfo(nextNode, nextCost))
            }
        }
    }

    return cost
}