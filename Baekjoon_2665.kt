import java.util.*

private lateinit var miro: Array<IntArray>
private lateinit var change: Array<IntArray>
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    miro = Array(n) { IntArray(n) }
    change = Array(n) { IntArray(n) { Int.MAX_VALUE } }

    repeat(n) { i ->
        val stat = readLine()
        repeat(n) { j ->
            miro[i][j] = stat[j] - '0'
        }
    }

    move(n)
    println(change[n-1][n-1])
}

private fun move(n: Int) {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(0, 0))
    change[0][0] = 0

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.first
        val curX = cur.second

        for(i in 0 until 4) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(!checkCondition(n, nextY, nextX)) continue

            if(miro[nextY][nextX] == 1) {
                if(change[nextY][nextX] > change[curY][curX]) {
                    change[nextY][nextX] = change[curY][curX]
                    que.add(Pair(nextY, nextX))
                }
            }
            else {
                if(change[nextY][nextX] > change[curY][curX] + 1) {
                    change[nextY][nextX] = change[curY][curX] + 1
                    que.add(Pair(nextY, nextX))
                }
            }
        }
    }
}

private fun checkCondition(n: Int, y: Int, x: Int): Boolean = (y in 0 until n && x in 0 until n)