import java.util.*
import kotlin.collections.ArrayList

data class Info(val city: Int, val cost: Long): Comparable<Info> {
    override fun compareTo(other: Info): Int {
        return if(cost < other.cost) -1
        else 1
    }
}

private lateinit var route: Array<ArrayList<Pair<Int, Int>>>
private lateinit var parent: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val cityCnt = readLine().toInt()
    val busCnt = readLine().toInt()

    route = Array(cityCnt + 1) { ArrayList() }
    parent = IntArray(cityCnt + 1)

    repeat(busCnt) {
        val (from, to, cost) = readLine().split(" ").map { it.toInt() }
        route[from].add(Pair(to, cost))
    }

    val (start, end) = readLine().split(" ").map { it.toInt() }

    val cost = dijkstra(cityCnt, start, end)

    val visited = Stack<Int>()
    visited.add(end)
    var temp = parent[end]

    while(temp != 0) {
        visited.add(temp)
        temp = parent[temp]
    }

    println(cost)
    println(visited.size)
    while(visited.isNotEmpty()) print("${visited.pop()} ")
}

private fun dijkstra(n: Int, start: Int, end: Int): Long {
    val minCost = LongArray(n + 1) { Long.MAX_VALUE }
    val pq = PriorityQueue<Info>()
    pq.add(Info(start, 0))
    minCost[start] = 0

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curCity = cur.city
        val curCost = cur.cost

        if(curCity == end) return curCost
        if(curCost > minCost[curCity]) continue

        for(i in route[curCity].indices) {
            val nextCity = route[curCity][i].first
            val nextCost = curCost + route[curCity][i].second

            if(minCost[nextCity] > nextCost) {
                parent[nextCity] = curCity
                minCost[nextCity] = nextCost
                pq.add(Info(nextCity, nextCost))
            }
        }
    }

    return 0
}