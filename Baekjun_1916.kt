import java.util.*
import kotlin.collections.ArrayList

data class Info(val city: Int, val cost: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val cityCnt = readLine().toInt()
    val busCnt = readLine().toInt()
    val graph = Array(cityCnt + 1) { ArrayList<Pair<Int, Int>>() }

    repeat(busCnt) {
        val (from, to, cost) = readLine().split(" ").map { it.toInt() }
        graph[from].add(Pair(to, cost))
    }

    val (start, end) = readLine().split(" ").map { it.toInt() }
    println(dijkstra(start, end, cityCnt, graph))
}

private fun dijkstra(start: Int, end: Int, cityCnt: Int, graph: Array<ArrayList<Pair<Int, Int>>>): Int {
    val cost = IntArray(cityCnt + 1) { Int.MAX_VALUE }
    cost[start] = 0

    val pq = PriorityQueue<Info>()
    pq.add(Info(start, 0))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curCity = cur.city
        val curCost = cur.cost

        if(curCity == end) break

        for(i in graph[curCity].indices) {
            val nextCity = graph[curCity][i].first
            val nextCost = curCost + graph[curCity][i].second

            if(nextCost < cost[nextCity]) {
                cost[nextCity] = nextCost
                pq.add(Info(nextCity, nextCost))
            }
        }
    }

    return cost[end]
}