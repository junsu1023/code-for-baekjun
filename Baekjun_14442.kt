import java.util.*

private lateinit var map: Array<IntArray>
private val dx = arrayOf(1, -1, 0, 0)
private val dy = arrayOf(0, 0, 1, -1)

private data class Point(val y: Int, val x: Int, val breakCnt: Int, val cnt: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val (row, col, canBreak) = readLine().split(" ").map { it.toInt() }
    map = Array(row) { IntArray(col) }

    repeat(row) { i ->
        val state = readLine()
        repeat(col) { j ->
            map[i][j] = state[j] - '0'
        }
    }

    println(move(row, col, canBreak))
}

fun move(row: Int, col: Int, canBreak: Int): Int {
    val visited = Array(row) { Array(col) { BooleanArray(canBreak + 1) } }
    val que: Queue<Point> = LinkedList()
    que.add(Point(0, 0, canBreak, 1))

    while(!que.isEmpty()) {
        val nowY = que.peek().y
        val nowX = que.peek().x
        val breakCnt = que.peek().breakCnt
        val moveCnt = que.peek().cnt
        que.poll()

        if(nowY == row - 1 && nowX == col - 1) return moveCnt

        for(i in 0 until 4) {
            val nextY = nowY + dy[i]
            val nextX = nowX + dx[i]

            if(nextY in 0 until row && nextX in 0 until col && !visited[nextY][nextX][breakCnt]) {
                if(map[nextY][nextX] == 0) {
                    visited[nextY][nextX][breakCnt] = true
                    que.add(Point(nextY, nextX, breakCnt, moveCnt + 1))
                }
                else {
                    if(breakCnt > 0) {
                        visited[nextY][nextX][breakCnt] = true
                        que.add(Point(nextY, nextX, breakCnt - 1, moveCnt + 1))
                    }
                }
            }
        }
    }
    return -1
}