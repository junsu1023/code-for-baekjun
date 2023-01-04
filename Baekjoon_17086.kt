import java.util.*
import kotlin.math.max

private var n = 0
private var m = 0
private var maxSafeArea = 0
private lateinit var map: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private val que: Queue<Pair<Int, Int>> = LinkedList()
private val dx = arrayListOf(1, 1, 1, -1, -1, -1, 0, 0)
private val dy = arrayListOf(1, -1, 0, 1, -1, 0, 1, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val size = readLine().split(" ").map { it.toInt() }
    n = size[0]
    m = size[1]

    map = Array(n) { IntArray(m) }
    visited = Array(n) { BooleanArray(m) }

    repeat(n) { i ->
        val state = readLine().split(" ").map { it.toInt() }
        repeat(m) { j ->
            map[i][j] = state[j]
        }
    }

    repeat(n) { i ->
        repeat(m) { j ->
            if(map[i][j] == 1) {
                que.add(Pair(i, j))
                map[i][j] = 0
                visited[i][j] = true
            }
        }
    }

    bfs()

    println(maxSafeArea)
}

private fun bfs() {
    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.first
        val curX = cur.second

        for(i in 0 until 8) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(!isCondition(nextY, nextX)) continue

            visited[nextY][nextX] = true
            map[nextY][nextX] = map[curY][curX] + 1
            que.add(Pair(nextY, nextX))

            maxSafeArea = max(maxSafeArea, map[nextY][nextX])
        }
    }
}

private fun isCondition(y: Int, x: Int): Boolean = y in 0 until n && x in 0 until m && !visited[y][x]