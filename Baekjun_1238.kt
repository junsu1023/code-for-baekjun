import java.util.*
import kotlin.collections.ArrayList

data class Info(val node: Int, val time: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = time - other.time
}

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m, x) = readLine().split(" ").map { it.toInt() }

    val graph = Array(n + 1) { ArrayList<Pair<Int, Int>>() }
    repeat(m) {
        val (from, to, time) = readLine().split(" ").map { it.toInt() }
        graph[from].add(Pair(to, time))
    }

    val totalTime = PriorityQueue<Int>(reverseOrder())
    for(i in 1 .. n) {
        var total = dijkstra(n, i, x, graph)
        total += dijkstra(n, x, i, graph)
        totalTime.add(total)
    }

    println(totalTime.poll())
}

private fun dijkstra(n: Int, start: Int, end: Int, graph: Array<ArrayList<Pair<Int, Int>>>): Int {
    val time = IntArray(n + 1) { Int.MAX_VALUE }
    time[start] = 0

    val pq = PriorityQueue<Info>()
    pq.add(Info(start, 0))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curNode = cur.node
        val curTime = cur.time

        if(curNode == end) break

        for(i in graph[curNode].indices) {
            val nextNode = graph[curNode][i].first
            val nextTime = curTime + graph[curNode][i].second

            if(nextTime < time[nextNode]) {
                time[nextNode] = nextTime
                pq.add(Info(nextNode, nextTime))
            }
        }
    }

    return time[end]
}