import java.util.*

private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private lateinit var map: Array<IntArray>

data class Point(val y: Int, val x: Int, val cnt: Int): Comparable<Point> {
    override fun compareTo(other: Point): Int = cnt - other.cnt
}

fun main() = with(System.`in`.bufferedReader()) {
    val (col, row) = readLine().split(" ").map { it.toInt() }

    map = Array(row) { IntArray(col) }
    repeat(row) { i ->
        val state = readLine().toCharArray()
        repeat(col) { j ->
            map[i][j] = state[j] - '0'
        }
    }

    println(bfs(row, col))
}

private fun bfs(row: Int, col: Int): Int {
    val visited = Array(row) { BooleanArray(col) }
    visited[0][0] = true

    val pq = PriorityQueue<Point>()
    pq.add(Point(0, 0, 0))

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val curY = cur.y
        val curX = cur.x
        val curCnt = cur.cnt

        if(curY == row - 1 && curX == col - 1) return curCnt

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(nextY !in 0 until row || nextX !in 0 until col) continue

            if(!visited[nextY][nextX]) {
                visited[nextY][nextX] = true
                if(map[nextY][nextX] == 0) pq.add(Point(nextY, nextX, curCnt))
                else pq.add(Point(nextY, nextX, curCnt + 1))
            }
        }
    }

    return 0
}