import java.util.*
import kotlin.collections.ArrayList

private lateinit var pos: Array<BooleanArray>
private lateinit var visited: Array<BooleanArray>
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var row = 0
private var col = 0
private var blockCnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    input()

    var area = 0
    val sizeList = ArrayList<Int>()
    for(i in 0 until row) {
        for(j in 0 until col) {
            if(!pos[i][j] && !visited[i][j]) {
                sizeList.add(bfs(i, j))
                area++
            }
        }
    }
    sizeList.sort()

    println(area)
    for(i in sizeList) print("$i ")
}

private fun input() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    row = st.nextToken().toInt()
    col = st.nextToken().toInt()
    blockCnt = st.nextToken().toInt()

    pos = Array(row) { BooleanArray(col) }
    visited = Array(row) { BooleanArray(col) }

    repeat(blockCnt) {
        val (leftBottomX, leftBottomY, rightFloorX, rightFloorY) = readLine().split(" ").map { it.toInt() }

        for(i in leftBottomY until rightFloorY) {
            for(j in leftBottomX until rightFloorX) {
                pos[i][j] = true
            }
        }
    }
}

private fun bfs(y: Int, x: Int): Int {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(y, x))

    visited[y][x] = true

    var size = 1
    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.first
        val curX = cur.second

        repeat(4) { i ->
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(isCheck(nextY, nextX)) {
                que.add(Pair(nextY, nextX))
                visited[nextY][nextX] = true
                size++
            }
        }
    }

    return size
}

private fun isCheck(y: Int, x: Int): Boolean
= (y in 0 until row && x in 0 until col && !visited[y][x] && !pos[y][x])