import java.lang.StringBuilder
import java.util.*

private lateinit var map: Array<IntArray>
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)

data class Pos(val y: Int, val x: Int, val cost: Int): Comparable<Pos> {
    override fun compareTo(other: Pos): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    var cnt = 0

    while(true) {
        val size = readLine().toInt()
        if(size == 0) break

        map = Array(size) { IntArray(size) }

        repeat(size) { i ->
            val st = StringTokenizer(readLine())
            repeat(size) { j ->
                map[i][j] = st.nextToken().toInt()
            }
        }

        println("Problem ${++cnt}: ${dijkstra(size)}")
    }
}

private fun dijkstra(size: Int): Int {
    val cost = Array(size + 1) { IntArray(size + 1) { Integer.MAX_VALUE } }
    cost[0][0] = map[0][0]

    val pq = PriorityQueue<Pos>()
    pq.add(Pos(0, 0, cost[0][0]))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curY = cur.y
        val curX = cur.x
        val curCost = cur.cost

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(nextY !in 0 until size || nextX !in 0 until size) continue

            if(cost[nextY][nextX] > curCost + map[nextY][nextX]) {
                cost[nextY][nextX] = curCost + map[nextY][nextX]
                pq.add(Pos(nextY, nextX, cost[nextY][nextX]))
            }
        }
    }

    return cost[size-1][size-1]
}