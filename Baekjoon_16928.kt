import java.util.*

private val map = IntArray(101) { i -> i }
private val visited = BooleanArray(101)
private val ladder = HashMap<Int, Int>()
private val snake = HashMap<Int, Int>()
private val move = intArrayOf(1, 2, 3, 4, 5, 6)

fun main() = with(System.`in`.bufferedReader()) {
    val (ladderCnt, snakeCnt) = readLine().split(" ").map { it.toInt() }

    repeat(ladderCnt) {
        val (from, to) = readLine().split(" ").map { it.toInt() }
        ladder[from] = to
    }

    repeat(snakeCnt) {
        val (from ,to) = readLine().split(" ").map { it.toInt() }
        snake[from] = to
    }

    val ans = play()
    println(ans)
}



private fun play(): Int {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(1, 0))

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curPos = cur.first
        val curMoveCnt = cur.second

        if(curPos == 100) return curMoveCnt

        for(i in 0 until 6) {
            val nextPos = curPos + move[i]

            if(nextPos > 100 || map[nextPos] < curMoveCnt + 1 || visited[nextPos]) continue

            if(ladder.contains(nextPos)) {
                que.add(Pair(ladder[nextPos]!!, curMoveCnt + 1))
            }
            else if(snake.contains(nextPos)) {
                que.add(Pair(snake[nextPos]!!, curMoveCnt + 1))
            }
            else {
                que.add(Pair(nextPos, curMoveCnt + 1))
                visited[nextPos] = true
            }

            map[nextPos] = curMoveCnt + 1
        }
    }

    return 0
}