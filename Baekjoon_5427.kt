import java.util.*

private lateinit var map: Array<CharArray>
private lateinit var fireTime: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private val fireQue: Queue<Pair<Int, Int>> = LinkedList()
private var row = 0
private var col = 0
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) {
        val st = StringTokenizer(readLine())
        col = st.nextToken().toInt()
        row = st.nextToken().toInt()

        map = Array(row) { CharArray(col) }
        fireTime = Array(row) { IntArray(col) { Integer.MAX_VALUE } }
        visited = Array(row) { BooleanArray(col) }

        repeat(row) { i ->
            val stat = readLine().toCharArray()
            repeat(col) { j ->
                map[i][j] = stat[j]

                if (map[i][j] == '*') {
                    fireQue.add(Pair(i, j))
                    fireTime[i][j] = 0
                    visited[i][j] = true
                }
            }
        }

    }
}

private fun moveFire() {
    while(fireQue.isNotEmpty()) {
        val cur = fireQue.poll()
        val curY = cur.first
        val curX = cur.second

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(inRange(nextY, nextX) && !visited[nextY][nextX]) {
                fireTime[nextY][nextX] = fireTime[curY][curX] + 1
            }
        }
    }
}

private fun inRange(y: Int, x: Int): Boolean
= (y in 0 until row && x in 0 until col)