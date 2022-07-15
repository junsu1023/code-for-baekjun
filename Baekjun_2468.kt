import java.util.*

private var n = 0
private lateinit var arr: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private val que: Queue<Pair<Int, Int>> = LinkedList()
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var high = Integer.MIN_VALUE

fun main() {
    input()
    println(submerge())
}

private fun input() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    arr = Array(n) { IntArray(n) }
    visited = Array(n) { BooleanArray(n) }

    repeat(n) { i ->
        val st = StringTokenizer(readLine())
        repeat(n) { j ->
            arr[i][j] = st.nextToken().toInt()
            high = maxOf(high, arr[i][j]
        }
    }
}

private fun submerge(): Int {
    var maxArea = 0
    for(i in 0 until high) {
        resetVisited()
        maxArea = maxOf(maxArea, safeAreaCount(i))
    }

    return maxArea
}

private fun safeAreaCount(height: Int): Int {
    var cnt = 0
    repeat(n) { i ->
        repeat(n) { j ->
            if(arr[i][j] > height && !visited[i][j]) {
                cnt++
                que.add(Pair(i, j))
                bfs(height)
            }
        }
    }

     return cnt
}

private fun bfs(height: Int) {
    while(que.isNotEmpty()) {
        val cur = que.poll()
        for(i in 0 until 4) {
            val nextY = cur.first + dy[i]
            val nextX = cur.second + dx[i]

            if(!rangeCheck(nextY, nextX, height)) continue

            visited[nextY][nextX] = true
            que.add(Pair(nextY, nextX))
        }
    }
}

private fun rangeCheck(y: Int, x: Int, height: Int): Boolean {
    if(y !in 0 until n || x !in 0 until n  || arr[y][x] <= height || visited[y][x]) return false
    return true
}

private fun resetVisited() {
    repeat(n) { i ->
        repeat(n) { j ->
            visited[i][j] = false
        }
    }
}