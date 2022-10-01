import java.util.*
import kotlin.math.max

private lateinit var arr: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var n = 0
private var m = 0

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()

    arr = Array(n) { IntArray(m) }
    visited = Array(n) { BooleanArray(m) }

    repeat(n) { i ->
        st = StringTokenizer(readLine())
        repeat(m) { j ->
            arr[i][j] = st.nextToken().toInt()
        }
    }

    
    var cnt = 0
    var maxArea = 0
    for(i in 0 until n) {
        for(j in 0 until m) {
            if(arr[i][j] == 1 && !visited[i][j]) {
                cnt++
                maxArea = max(maxArea, bfs(i, j))
            }
        }
    }

    println(cnt)
    println(maxArea)
}

private fun bfs(y: Int, x: Int): Int {
    var area = 1
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(y, x))
    visited[y][x] = true

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.first
        val curX = cur.second

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(!inRange(nextY, nextX)) continue
            if(visited[nextY][nextX]) continue
            if(arr[nextY][nextX] != 1) continue

            visited[nextY][nextX] = true
            que.add(Pair(nextY, nextX))
            area++
        }
    }
    return area
}

private fun inRange(y: Int, x: Int): Boolean = y in 0 until n && x in 0 until m