import java.util.*

data class Coin(val firstCoinY: Int, val firstCoinX: Int, val secondCoinY: Int, val secondCoinX: Int, val cnt: Int)

private lateinit var board: Array<CharArray>
private lateinit var visited: Array<Array<Array<BooleanArray>>>
private val coin = Array(2) { Pair(0, 0) }
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var row = 0
private var col = 0

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    row = st.nextToken().toInt()
    col = st.nextToken().toInt()

    board = Array(row) { CharArray(col) }
    visited = Array(row) { Array(col) { Array(row) { BooleanArray(col) } } }

    var count = 0
    repeat(row) { i ->
        val stat = readLine().toCharArray()
        repeat(col) { j ->
            board[i][j] = stat[j]
            if(board[i][j] == 'o') {
                coin[count] = Pair(i, j)
                count++
            }
        }
    }

    val ans = play()

    println(ans)
}

private fun play(): Int {
    val que: Queue<Coin> = LinkedList()
    que.add(Coin(coin[0].first, coin[0].second, coin[1].first, coin[1].second, 0))

    while(que.isNotEmpty()) {
        val coins = que.poll()
        val firstCoinY = coins.firstCoinY
        val firstCoinX = coins.firstCoinX
        val secondCoinY = coins.secondCoinY
        val secondCoinX = coins.secondCoinX
        val curCnt = coins.cnt

        if(curCnt >= 10) break

        for(i in 0 until 4) {
            var nextFirstCoinY = firstCoinY + dy[i]
            var nextFirstCoinX = firstCoinX + dx[i]
            var nextSecondCoinY = secondCoinY + dy[i]
            var nextSecondCoinX = secondCoinX + dx[i]

            if(!canMove(nextFirstCoinY, nextFirstCoinX)) {
                nextFirstCoinY = firstCoinY
                nextFirstCoinX = firstCoinX
            }

            if(!canMove(nextSecondCoinY, nextSecondCoinX)) {
                nextSecondCoinY = secondCoinY
                nextSecondCoinX = secondCoinX
            }

            var flag = 0
            if(nextFirstCoinY in 0 until row && nextFirstCoinX in 0 until col) flag++
            if(nextSecondCoinY in 0 until row && nextSecondCoinX in 0 until col) flag++

            if(flag == 1) return coins.cnt + 1
            else if(flag == 2 && !visited[nextFirstCoinY][nextFirstCoinX][nextSecondCoinY][nextSecondCoinX]) {
                visited[nextFirstCoinY][nextFirstCoinX][nextSecondCoinY][nextSecondCoinX] = true
                que.add(Coin(nextFirstCoinY, nextFirstCoinX, nextSecondCoinY, nextSecondCoinX, curCnt + 1))
            }
        }
    }

    return -1
}

private fun canMove(y: Int, x: Int): Boolean = !(y in 0 until row && x in 0 until col && board[y][x] == '#')