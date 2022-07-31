import java.util.*

private var row = 0
private var col = 0
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private lateinit var map: Array<CharArray>
private lateinit var visited: Array<BooleanArray>

data class Node(val y: Int, val x: Int, val cost: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    row = st.nextToken().toInt()
    col = st.nextToken().toInt()

    map = Array(row) { CharArray(col) }
    visited = Array(row) { BooleanArray(col) }

    repeat(row) { i ->
        val lw = readLine().toCharArray()
        repeat(col) { j ->
            map[i][j] = lw[j]
        }
    }

    var ans = 0
    repeat(row) { i->
        repeat(col) { j ->
            if(map[i][j] == 'L') {
                resetVisited()
                val time = bfs(i, j)
                ans = maxOf(ans, time)
            }
        }
    }

    println(ans)
}

private fun resetVisited() {
    repeat(row) { i ->
        repeat(col) { j ->
            visited[i][j] = false
        }
    }
}

private fun bfs(y: Int, x: Int): Int {
    val que: Queue<Node> = LinkedList()
    que.add(Node(y, x, 0))
    visited[y][x] = true

    var time = 0
    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.y
        val curX = cur.x
        val curCost = cur.cost

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(nextY !in 0 until row || nextX !in 0 until col) continue
            if(visited[nextY][nextX] || map[nextY][nextX] == 'W') continue

            que.add(Node(nextY, nextX, curCost + 1))
            time = maxOf(time, curCost + 1)
            visited[nextY][nextX] = true
        }
    }

    return time
}