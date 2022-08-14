import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

private var n = 0
private var l = 0
private var r = 0
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private val canMove = ArrayList<Pair<Int, Int>>()
private val que: Queue<Pair<Int, Int>> = LinkedList()
private lateinit var map: Array<IntArray>
private lateinit var visited: Array<BooleanArray>

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    n = st.nextToken().toInt()
    l = st.nextToken().toInt()
    r = st.nextToken().toInt()

    map = Array(n) { IntArray(n) }
    repeat(n) { i ->
        st = StringTokenizer(readLine())
        repeat(n) { j ->
            map[i][j] = st.nextToken().toInt()
        }
    }

    println(move())
}

private fun move(): Int {
    var day = 0
    while(true) {
        visited = Array(n) { BooleanArray(n) }

        var isMove = false
        repeat(n) { i ->
            repeat(n) { j ->
                if(!visited[i][j]) {
                    val total = bfs(i, j)

                    if(canMove.size > 1) {
                        afterMove(total)
                        isMove = true
                    }
                }
            }
        }

        if(!isMove) return day
        day++
    }
}

private fun bfs(y: Int, x: Int): Int {
    canMove.clear()
    que.clear()

    que.add(Pair(y, x))
    canMove.add(Pair(y, x))
    visited[y][x] = true

    var total = map[y][x]
    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.first
        val curX = cur.second

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(isCondition(nextY, nextX)) {
                val diff = abs(map[nextY][nextX] - map[curY][curX])
                if(diff in l .. r) {
                    que.add(Pair(nextY, nextX))
                    canMove.add(Pair(nextY, nextX))
                    total += map[nextY][nextX]
                    visited[nextY][nextX] = true
                }
            }
        }
    }

    return total
}

private fun afterMove(total: Int) {
    val avg = total / canMove.size
    for(i in canMove) map[i.first][i.second] = avg
}

private fun isCondition(y: Int, x: Int): Boolean = (y in 0 until n && x in 0 until n && !visited[y][x])