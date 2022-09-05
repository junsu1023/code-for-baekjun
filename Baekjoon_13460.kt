import java.util.*
import kotlin.math.abs

data class BallInfo(val redY: Int, val redX: Int, val blueY: Int, val blueX: Int, val cnt: Int)

private lateinit var map: Array<CharArray>
private lateinit var visited: Array<Array<Array<BooleanArray>>>
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var redBall = Pair(0, 0)
private var blueBall = Pair(0, 0)
private var row = 0
private var col = 0

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    row = st.nextToken().toInt()
    col = st.nextToken().toInt()

    map = Array(row) { CharArray(col) }
    visited = Array(row) { Array(col) { Array(row) { BooleanArray(col) } } }

    repeat(row) { i ->
        val stat = readLine().toCharArray()
        repeat(col) { j ->
            map[i][j] = stat[j]

            if(map[i][j] == 'R') redBall = Pair(i, j)
            if(map[i][j] == 'B') blueBall = Pair(i, j)
        }
    }

    println(move())
}

private fun move(): Int {
    val ballPos: Queue<BallInfo> = LinkedList()
    ballPos.add(BallInfo(redBall.first, redBall.second, blueBall.first, blueBall.second, 0))

    visited[redBall.first][redBall.second][blueBall.first][blueBall.second] = true

    while(ballPos.isNotEmpty()) {
        val cur = ballPos.poll()
        val curRedBallY = cur.redY
        val curRedBallX = cur.redX
        val curBlueBallY = cur.blueY
        val curBlueBallX = cur.blueX
        val curCnt = cur.cnt

        visited[curRedBallY][curRedBallX][curBlueBallY][curBlueBallX] = true

        if(map[curRedBallY][curRedBallX] == 'O') return curCnt
        if(curCnt > 10) return -1

        for(i in 0 until 4) {
            var nextRedBallY = curRedBallY
            var nextRedBallX = curRedBallX
            var nextBlueBallY = curBlueBallY
            var nextBlueBallX = curBlueBallX

            while(true) {
                nextRedBallY += dy[i]
                nextRedBallX += dx[i]

                if(map[nextRedBallY][nextRedBallX] == '#') {
                    nextRedBallY -= dy[i]
                    nextRedBallX -= dx[i]
                    break
                }

                if(map[nextRedBallY][nextRedBallX] == 'O') break
            }

            while(true) {
                nextBlueBallY += dy[i]
                nextBlueBallX += dx[i]

                if(map[nextBlueBallY][nextBlueBallX] == '#') {
                    nextBlueBallY -= dy[i]
                    nextBlueBallX -= dx[i]
                    break
                }

                if(map[nextBlueBallY][nextBlueBallX] == 'O') break
            }

            if(map[nextBlueBallY][nextBlueBallX] == 'O') continue

            if(nextRedBallY == nextBlueBallY && nextRedBallX == nextBlueBallX) {
                val moveRedBall = abs(nextRedBallY - curRedBallY) + abs(nextRedBallX - curRedBallX)
                val moveBlueBall = abs(nextBlueBallY - curBlueBallY) + abs(nextBlueBallX - curBlueBallX)

                if(moveRedBall > moveBlueBall) {
                    nextRedBallY -= dy[i]
                    nextRedBallX -= dx[i]
                }
                else {
                    nextBlueBallY -= dy[i]
                    nextBlueBallX -= dx[i]
                }
            }

            if(!visited[nextRedBallY][nextRedBallX][nextBlueBallY][nextBlueBallX]) {
                ballPos.add(BallInfo(nextRedBallY, nextRedBallX, nextBlueBallY, nextBlueBallX, curCnt + 1))
            }
        }
    }

    return -1
}