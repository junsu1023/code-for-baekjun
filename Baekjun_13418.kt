import java.util.*
import kotlin.collections.ArrayList

private lateinit var edge: Array<ArrayList<Pair<Int, Int>>>
private lateinit var visited: BooleanArray

data class Des(val node: Int, val tired: Int): Comparable<Des> {
    override fun compareTo(other: Des): Int = other.tired - tired
}

data class Asc(val node: Int, val tired: Int): Comparable<Asc> {
    override fun compareTo(other: Asc): Int = tired - other.tired
}

fun main() = with(System.`in`.bufferedReader()) {
    val (nodeCnt, edgeCnt) = readLine().split(" ").map { it.toInt() }

    edge = Array(nodeCnt + 1) { ArrayList() }
    visited = BooleanArray(nodeCnt + 1)

    repeat(edgeCnt + 1) {
        var (start, end, isAsc) = readLine().split(" ").map { it.toInt() }
        isAsc = if(isAsc == 1) 0
        else 1
        edge[start].add(Pair(end, isAsc))
        edge[end].add(Pair(start, isAsc))
    }
    val maxTired = maxTired()
    repeat(nodeCnt + 1) { i -> visited[i] = false }
    val minTired = minTired()

    println(maxTired - minTired)
}

fun maxTired(): Int {
    var tired = 0
    val pq = PriorityQueue<Des>()
    pq.add(Des(0, 0))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        if(visited[cur.node]) continue

        visited[cur.node] = true
        tired += cur.tired

        for(i in 0 until edge[cur.node].size) {
            if(!visited[edge[cur.node][i].first]) {
                pq.add(Des(edge[cur.node][i].first, edge[cur.node][i].second))
            }
        }
    }

    return tired * tired
}

private fun minTired(): Int {
    var tired = 0
    val pq = PriorityQueue<Asc>()
    pq.add(Asc(0, 0))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        if(visited[cur.node]) continue

        visited[cur.node] = true
        tired += cur.tired

        for(i in 0 until edge[cur.node].size) {
            if(!visited[edge[cur.node][i].first]) {
                pq.add(Asc(edge[cur.node][i].first, edge[cur.node][i].second))
            }
        }
    }

    return tired * tired
}