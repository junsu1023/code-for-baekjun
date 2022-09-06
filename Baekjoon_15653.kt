import java.util.*
import kotlin.math.abs

data class MarbleInfo(val redY: Int, val redX: Int, val blueY: Int, val blueX: Int, val cnt: Int)

private lateinit var map: Array<CharArray>
private lateinit var visited: Array<Array<Array<BooleanArray>>>
private lateinit var redMarble: Pair<Int, Int>
private lateinit var blueMarble: Pair<Int, Int>
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
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

            if(map[i][j] == 'R') redMarble = Pair(i, j)
            if(map[i][j] == 'B') blueMarble = Pair(i, j)
        }
    }

    println(move())
}

private fun move(): Int {
    val marbleQue: Queue<MarbleInfo> = LinkedList()
    marbleQue.add(MarbleInfo(redMarble.first, redMarble.second, blueMarble.first, blueMarble.second, 0))
    visited[redMarble.first][redMarble.second][blueMarble.first][blueMarble.second] = true

    while(marbleQue.isNotEmpty()) {
        val cur = marbleQue.poll()
        val curRedMarbleY = cur.redY
        val curRedMarbleX = cur.redX
        val curBlueMarbleY = cur.blueY
        val curBlueMarbleX = cur.blueX
        val curCnt = cur.cnt

        visited[curRedMarbleY][curRedMarbleX][curBlueMarbleY][curBlueMarbleX] = true

        if(map[curRedMarbleY][curRedMarbleX] == 'O') return curCnt

        for(i in 0 until 4) {
            var nextRedMarbleY = curRedMarbleY
            var nextRedMarbleX = curRedMarbleX
            var nextBlueMarbleY = curBlueMarbleY
            var nextBlueMarbleX = curBlueMarbleX

            while(true) {
                nextRedMarbleY += dy[i]
                nextRedMarbleX += dx[i]

                if(map[nextRedMarbleY][nextRedMarbleX] == '#') {
                    nextRedMarbleY -= dy[i]
                    nextRedMarbleX -= dx[i]
                    break
                }

                if(map[nextRedMarbleY][nextRedMarbleX] == 'O') break
            }

            while(true) {
                nextBlueMarbleY += dy[i]
                nextBlueMarbleX += dx[i]

                if(map[nextBlueMarbleY][nextBlueMarbleX] == '#') {
                    nextBlueMarbleY -= dy[i]
                    nextBlueMarbleX -= dx[i]
                    break
                }

                if(map[nextBlueMarbleY][nextBlueMarbleX] == 'O') break
            }

            if(map[nextBlueMarbleY][nextBlueMarbleX] == 'O') continue

            if(nextRedMarbleY == nextBlueMarbleY && nextRedMarbleX == nextBlueMarbleX) {
                val moveRedMarble = abs(nextRedMarbleY - curRedMarbleY) + abs(nextRedMarbleX - curRedMarbleX)
                val moveBlueMarble = abs(nextBlueMarbleY - curBlueMarbleY) + abs(nextBlueMarbleX - curBlueMarbleX)

                if(moveRedMarble > moveBlueMarble) {
                    nextRedMarbleY -= dy[i]
                    nextRedMarbleX -= dx[i]
                }
                else {
                    nextBlueMarbleY -= dy[i]
                    nextBlueMarbleX -= dx[i]
                }
            }

            if(!visited[nextRedMarbleY][nextRedMarbleX][nextBlueMarbleY][nextBlueMarbleX]) {
                marbleQue.add(MarbleInfo(nextRedMarbleY, nextRedMarbleX, nextBlueMarbleY, nextBlueMarbleX, curCnt + 1))
            }
        }
    }
    return -1
}