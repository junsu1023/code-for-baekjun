import java.util.*
import kotlin.collections.ArrayList

private var cityCnt = 0
private var roadCnt = 0
private var k = 0

data class Travel(val city: Int, val time: Int): Comparable<Travel> {
    override fun compareTo(other: Travel): Int = time - other.time
}

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    cityCnt = st.nextToken().toInt()
    roadCnt = st.nextToken().toInt()
    k = st.nextToken().toInt()

    val graph = Array(cityCnt + 1) { ArrayList<Pair<Int, Int>>() }
    repeat(roadCnt) {
        val (from, to, time) = readLine().split(" ").map { it.toInt() }
        graph[from].add(Pair(to, time))
    }

    val time = dijkstra(graph)
    for(i in 1 .. cityCnt) {
        if(time[i].size != k) println(-1)
        else println(time[i].peek())
    }
}

private fun dijkstra(graph: Array<ArrayList<Pair<Int, Int>>>): Array<PriorityQueue<Int>> {
    val time = Array(cityCnt + 1) { PriorityQueue<Int>(reverseOrder()) }
    val pq = PriorityQueue<Travel>()
    pq.add(Travel(1, 0))
    time[1].add(0)

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curCity = cur.city
        val curTime = cur.time

        for(i in graph[curCity].indices) {
            val nextCity = graph[curCity][i].first
            val nextTime = curTime + graph[curCity][i].second

            if(time[nextCity].size < k) {
                time[nextCity].add(nextTime)
                pq.add(Travel(nextCity, nextTime))
            }
            else if(time[nextCity].peek() > nextTime) {
                time[nextCity].poll()
                time[nextCity].add(nextTime)
                pq.add(Travel(nextCity, nextTime))
            }
        }
    }

    return time
}