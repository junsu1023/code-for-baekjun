import java.util.*
import kotlin.collections.ArrayList

private lateinit var board: Array<IntArray>
private var timeToDirection = ArrayList<Pair<Int, Int>>()
private val direction = arrayOf(0 to 1, 1 to 0, 0 to -1, -1 to 0)
private var size = 0
private var changeDirCnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    size = readLine().toInt()
    board = Array(size) { IntArray(size) }

    val appleCnt = readLine().toInt()
    repeat(appleCnt) {
        val (y, x) = readLine().split(" ").map { it.toInt() }
        board[y - 1][x - 1] = 1
    }

    changeDirCnt = readLine().toInt()
    timeToDirection = ArrayList()
    repeat(changeDirCnt) {
        val st = StringTokenizer(readLine())
        val time = st.nextToken().toInt()
        val dir = st.nextToken()
        if(dir == "D") timeToDirection.add(Pair(time, 1))
        else timeToDirection.add(Pair(time, -1))
    }

    println(move())
}

fun move(): Int {
    val snake: Queue<Pair<Int, Int>> = LinkedList()
    board[0][0] = -1
    var time = 0; var turn = 0; var curDir = 0
    var head = Pair(0, 0)
    snake.add(head)

    while(true) {
        time++
        val ny = head.first + direction[curDir].first
        val nx = head.second + direction[curDir].second

        if(ny < 0 || ny >= size || nx < 0 || nx >= size || board[ny][nx] == -1) break

        if(board[ny][nx] != 1) {
            val tail = snake.poll()
            board[tail.first][tail.second] = 0
        }

        head = Pair(ny, nx)
        snake.add(head)
        board[ny][nx] = -1

        if(turn < changeDirCnt && timeToDirection[turn].first == time) {
            curDir = (curDir + timeToDirection[turn].second) % 4
            if(curDir == -1) curDir = 3
            turn++
        }
    }
    return time
}