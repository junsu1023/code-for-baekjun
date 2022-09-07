import java.util.*
import kotlin.collections.ArrayList

private lateinit var graph: Array<ArrayList<Pair<Int, Int>>>
private lateinit var cost: IntArray
private const val INF = 50000000

data class BarnInfo(val barn: Int, val cost: Int): Comparable<BarnInfo> {
    override fun compareTo(other: BarnInfo): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val (barnCnt, roadCnt) = readLine().split(" ").map { it.toInt() }

    graph = Array(barnCnt + 1) { ArrayList() }
    cost = IntArray(barnCnt + 1) { INF }

    repeat(roadCnt) {
        val (from, to, cost) = readLine().split(" ").map { it.toInt() }
        graph[from].add(Pair(to, cost))
        graph[to].add(Pair(from, cost))
    }

    dijkstra()

    println(cost[barnCnt])
}

private fun dijkstra() {
    cost[1] = 0
    val pq = PriorityQueue<BarnInfo>()
    pq.add(BarnInfo(1, 0))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curBurn = cur.barn
        val curCost = cur.cost

        for(i in graph[curBurn]) {
            val nextBurn = i.first
            val nextCost = curCost + i.second

            if(cost[nextBurn] > nextCost) {
                cost[nextBurn] = nextCost
                pq.add(BarnInfo(nextBurn, nextCost))
            }
        }
    }
}