import java.util.*

data class Monkey(val y: Int, val x: Int, val cnt : Int, val canMoveLikeHorse: Int)

private lateinit var map: Array<IntArray>
private lateinit var visited: Array<Array<BooleanArray>>
private val monkeyX = intArrayOf(1, -1, 0, 0)
private val monkeyY = intArrayOf(0, 0, 1, -1)
private val horseX = intArrayOf(-2, -1, 1, 2, -2, -1, 1, 2)
private val horseY = intArrayOf(1, 2, 2, 1, -1, -2, -2, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val canMoveLikeHorse = readLine().toInt()
    val (col, row) = readLine().split(" ").map { it.toInt() }

    map = Array(row) { IntArray(col) }
    visited = Array(row) { Array(col) { BooleanArray(canMoveLikeHorse + 1) } }

    repeat(row) { i ->
        val st = StringTokenizer(readLine())
        repeat(col) { j ->
            map[i][j] = st.nextToken().toInt()
        }
    }

    val ans = move(row, col, canMoveLikeHorse)
    if(ans == Integer.MAX_VALUE) println(-1)
    else println(ans)
}

private fun move(row: Int, col: Int, canMoveLikeHorse: Int): Int {
    val que: Queue<Monkey> = LinkedList()
    que.add(Monkey(0, 0, 0, canMoveLikeHorse))
    visited[0][0][canMoveLikeHorse] = true

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.y
        val curX = cur.x
        val curCnt = cur.cnt
        val curCanHorse = cur.canMoveLikeHorse

        if(curY == row - 1 && curX == col - 1) return curCnt

        repeat(4) { i ->
            val nextY = curY + monkeyY[i]
            val nextX = curX + monkeyX[i]

            if(inRange(nextY, nextX, row, col) && !visited[nextY][nextX][curCanHorse] && map[nextY][nextX] == 0) {
                que.add(Monkey(nextY, nextX, curCnt + 1, curCanHorse))
                visited[nextY][nextX][curCanHorse] = true
            }
        }

        if(curCanHorse > 0) {
            repeat(8) { i ->
                val nextY = curY + horseY[i]
                val nextX = curX + horseX[i]

                if(inRange(nextY, nextX, row, col) && !visited[nextY][nextX][curCanHorse-1] && map[nextY][nextX] == 0) {
                    que.add(Monkey(nextY, nextX, curCnt + 1, curCanHorse - 1))
                    visited[nextY][nextX][curCanHorse - 1] = true
                }
            }
        }
    }

    return Integer.MAX_VALUE
}

private fun inRange(y: Int, x: Int, row: Int, col: Int): Boolean = (y in 0 until row && x in 0 until col)