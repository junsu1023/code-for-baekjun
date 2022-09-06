import java.util.*
import kotlin.math.abs

data class MarbleInfo(val redY: Int, val redX: Int, val blueY: Int, val blueX: Int, val cnt: Int, val route: String)

private lateinit var map: Array<CharArray>
private lateinit var visited: Array<Array<Array<BooleanArray>>>
private lateinit var redBall: Pair<Int, Int>
private lateinit var blueBall: Pair<Int, Int>
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var row = 0
private var col = 0
private var ansCnt = 0
private var ansRoute = ""

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

    move()
}

private fun move() {
    val marbleQue: Queue<MarbleInfo> = LinkedList()
    marbleQue.add(MarbleInfo(redBall.first, redBall.second, blueBall.first, blueBall.second, 0, ""))

    visited[redBall.first][redBall.second][blueBall.first][blueBall.second] = true

    while(marbleQue.isNotEmpty()) {
        val cur = marbleQue.poll()
        val curRedBallY = cur.redY
        val curRedBallX = cur.redX
        val curBlueBallY = cur.blueY
        val curBlueBallX = cur.blueX
        val curCnt = cur.cnt
        val curRoute = cur.route

        visited[curRedBallY][curRedBallX][curBlueBallY][curBlueBallX] = true

        if(curCnt > 10) {
            println(-1)
            return
        }
        if(map[curRedBallY][curRedBallX] == 'O') {
            println(curCnt)
            println(curRoute)
            return
        }

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
                when(i) {
                    0 -> marbleQue.add(MarbleInfo(nextRedBallY, nextRedBallX, nextBlueBallY, nextBlueBallX, curCnt + 1, curRoute + "R"))
                    1 -> marbleQue.add(MarbleInfo(nextRedBallY, nextRedBallX, nextBlueBallY, nextBlueBallX, curCnt + 1, curRoute + "L"))
                    2 -> marbleQue.add(MarbleInfo(nextRedBallY, nextRedBallX, nextBlueBallY, nextBlueBallX, curCnt + 1, curRoute + "D"))
                    3 -> marbleQue.add(MarbleInfo(nextRedBallY, nextRedBallX, nextBlueBallY, nextBlueBallX, curCnt + 1, curRoute + "U"))
                }
            }
        }
    }
    println(-1)
}