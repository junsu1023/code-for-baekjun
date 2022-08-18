import java.util.*

private lateinit var map: Array<CharArray>
private lateinit var visited: Array<IntArray>
private lateinit var overflowingTime: Array<IntArray>
private val hedgehog: Queue<Pair<Int, Int>> = LinkedList()
private val water: Queue<Pair<Int, Int>> = LinkedList()
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val (row, col) = readLine().split(" ").map { it.toInt() }

    map = Array(row) { CharArray(col) }
    visited = Array(row) { IntArray(col) }
    overflowingTime = Array(row) { IntArray(col) }

    repeat(row) { i ->
        val stat = readLine().toCharArray()
        repeat(col) { j ->
            map[i][j] = stat[j]
            if(map[i][j] == 'S') hedgehog.add(Pair(i, j))
            if(map[i][j] == '*')  water.add(Pair(i, j))
        }
    }

    waterFill(row, col)

    val time = move(row, col)
    if(time == 0) println("KAKTUS")
    else println(time)
}

private fun move(row: Int, col: Int): Int {
    while(hedgehog.isNotEmpty()) {
        val cur = hedgehog.poll()
        val curY = cur.first
        val curX = cur.second

        if(map[curY][curX] == 'D') return visited[curY][curX]

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(!inRange(nextY, nextX, row, col)) continue
            if(visited[nextY][nextX] == 0 && (map[nextY][nextX] == '.' || map[nextY][nextX] == 'D')) {
                if(overflowingTime[nextY][nextX] == 0 || overflowingTime[nextY][nextX] > visited[curY][curX] + 1) {
                    visited[nextY][nextX] = visited[curY][curX] + 1
                    hedgehog.add(Pair(nextY, nextX))
                }
            }
        }
    }

    return 0
}

private fun waterFill(row: Int, col: Int) {
    while(water.isNotEmpty()) {
        val cur = water.poll()
        val curY = cur.first
        val curX = cur.second

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(!inRange(nextY, nextX, row, col)) continue
            if(overflowingTime[nextY][nextX] == 0 && map[nextY][nextX] == '.') {
                overflowingTime[nextY][nextX] = overflowingTime[curY][curX] + 1
                water.add(Pair(nextY, nextX))
            }
        }
    }
}

private fun inRange(y: Int, x: Int, row: Int, col: Int): Boolean = (y in 0 until row && x in 0 until col)