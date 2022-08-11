import java.util.*

private var n = 0
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var len = Int.MAX_VALUE
private lateinit var map: Array<IntArray>
private lateinit var visited: Array<BooleanArray>

data class Pos(val y: Int, val x: Int, val dist: Int)

fun main() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    map = Array(n) { IntArray(n) }
    visited = Array(n) { BooleanArray(n) }

    repeat(n) { i ->
        val st = StringTokenizer(readLine())
        repeat(n) { j ->
            map[i][j] = st.nextToken().toInt()
            if(map[i][j] == 1) map[i][j] = -1
        }
    }

    var land = 1
    repeat(n) { i ->
        repeat(n) { j ->
            if(map[i][j] == -1 && !visited[i][j]) {
                compareLand(i, j, land)
                land++
            }
        }
    }

    repeat(n) { i ->
        repeat(n) { j ->
            if(map[i][j] != 0) putBridge(i, j)
        }
    }

    println(len)
}

private fun compareLand(y: Int, x: Int, land: Int) {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(y, x))
    visited[y][x] = true
    map[y][x] = land

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.first
        val curX = cur.second

        repeat(4) { i ->
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(checkRange(nextY, nextX)) {
                if(!visited[nextY][nextX] && map[nextY][nextX] == -1) {
                    visited[nextY][nextX] = true
                    map[nextY][nextX] = land
                    que.add(Pair(nextY, nextX))
                }
            }
        }
    }
}

private fun putBridge(y: Int, x: Int) {
    val que: Queue<Pos> = LinkedList()
    que.add(Pos(y, x, 0))
    for(i in 0 until n) visited[i].fill(false)
    visited[y][x] = true

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.y
        val curX = cur.x
        val curDist = cur.dist

        if(len <= curDist) return

        repeat(4) { i ->
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(checkRange(nextY, nextX) && !visited[nextY][nextX]) {
                if(map[nextY][nextX] == 0) {
                    visited[nextY][nextX] = true
                    que.add(Pos(nextY, nextX, curDist + 1))
                }
                else if(map[nextY][nextX] != map[y][x]) len = minOf(len, cur.dist)
            }
        }
    }
}

private fun checkRange(y: Int, x: Int): Boolean = (y in 0 until n && x in 0 until n)