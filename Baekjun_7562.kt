import java.util.*

private val dy = intArrayOf(1, 1, -1, -1, 2, 2, -2, -2)
private val dx = intArrayOf(-2, 2, -2, 2, -1, 1, -1, 1)
private var totalCnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) {
        val len = readLine().toInt()
        val visited = Array(len) { BooleanArray(len) }

        val (curY, curX) = readLine().split(" ").map { it.toInt() }
        val (targetY, targetX) = readLine().split(" ").map { it.toInt() }
        moveKnight(visited, curY, curX, targetY, targetX, len)

        println(totalCnt)
    }
}

private fun moveKnight(visited: Array<BooleanArray>, curY: Int, curX: Int, targetY: Int, targetX: Int, len: Int) {
    val que: Queue<Pair<Pair<Int, Int>, Int>> = LinkedList()
    que.add(Pair(Pair(curY, curX), 0))
    visited[curY][curX] = true

    while(que.isNotEmpty()) {
        val y = que.peek().first.first
        val x = que.peek().first.second
        val cnt = que.peek().second
        que.poll()

        if(y == targetY && x == targetX) {
            totalCnt = cnt
            return
        }

        for(i in 0 until 8) {
            val ny = y + dy[i]
            val nx = x + dx[i]

            if(ny !in 0 until len || nx !in 0 until len || visited[ny][nx]) continue
            que.add(Pair(Pair(ny, nx), cnt + 1))
            visited[ny][nx] = true
        }
    }
}