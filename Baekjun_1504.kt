import java.util.*
import kotlin.collections.ArrayList

private lateinit var graph: Array<ArrayList<Pair<Int, Int>>>

data class Info(val node: Int, val cost: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, e) = readLine().split(" ").map { it.toInt() }

    graph = Array(n + 1) { ArrayList<Pair<Int, Int>>() }

    repeat(e) {
        val (from, to , cost) = readLine().split(" ").map { it.toInt() }
        graph[from].add(Pair(to, cost))
        graph[to].add(Pair(from, cost))
    }

    val (v1, v2) = readLine().split(" ").map { it.toInt() }
    var temp1 = dijkstra(n, 1, v1)
    temp1 += dijkstra(n, v1, v2)
    temp1 += dijkstra(n, v2, n)

    var temp2 = dijkstra(n, 1, v2)
    temp2 += dijkstra(n, v2, v1)
    temp2 += dijkstra(n, v1, n)

    val ans = minOf(temp1, temp2)

    if(ans >= 200000000) println(-1)
    else println(ans)
}

private fun dijkstra(n: Int, start: Int, end: Int): Int {
    val visited = BooleanArray(n + 1) { false }
    val cost = IntArray(n + 1) { 200000000 }

    val pq = PriorityQueue<Info>()
    pq.add(Info(start, 0))
    cost[start] = 0

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curNode = cur.node
        val curCost = cur.cost

        if(curNode == end) break

        if(!visited[curNode]) {
            visited[curNode] = true

            for(i in graph[curNode].indices) {
                val nextNode = graph[curNode][i].first
                val nextCost = curCost + graph[curNode][i].second

                if(!visited[nextNode] && nextCost < cost[nextNode]) {
                    cost[nextNode] = nextCost
                    pq.add(Info(nextNode, nextCost))
                }
            }
        }
    }

    return cost[end]
}