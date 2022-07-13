import java.util.*

private lateinit var arr: Array<IntArray>
val dx = intArrayOf(1, -1, 0, 0)
val dy = intArrayOf(0, 0, 1, -1)
var row = 0
var col = 0
var result = 0

fun main() = with(System.`in`.bufferedReader()) {
    input()
    buildWall(0)
    println(result)
}

fun input() {
    var st = StringTokenizer(readLine())
    row = st.nextToken().toInt()
    col = st.nextToken().toInt()

    arr = Array(row) { IntArray(col) }
    repeat(row) { i ->
        st = StringTokenizer(readLine())
        repeat(col)  { j ->
            arr[i][j] = st.nextToken().toInt()
        }
    }
}

fun buildWall(depth: Int) {
    if(depth == 3) {
        moveVirus()
        return
    }

    repeat(row) { i ->
        repeat(col) { j ->
            if(arr[i][j] == 0) {
                arr[i][j] = 1
                buildWall(depth + 1)
                arr[i][j] = 0
            }
        }
    }
}

fun moveVirus() {
    val que: Queue<Pair<Int, Int>> = LinkedList()

    val virusArr = Array(row) { IntArray(col) }
    repeat(row) { i ->
        repeat(col) { j ->
            virusArr[i][j] = arr[i][j]
        }
    }

    repeat(row) { i ->
        repeat(col) { j ->
            if(virusArr[i][j] == 2) que.add(Pair(i, j))
        }
    }

    while(que.isNotEmpty()) {
        val nextPos = que.poll()

        for(i in 0 until 4) {
            val nextY = nextPos.first + dy[i]
            val nextX = nextPos.second + dx[i]

            if(nextY < 0 || nextY >= row || nextX < 0 || nextX >= col) continue
            if(virusArr[nextY][nextX] == 0) {
                virusArr[nextY][nextX] = 2
                que.add(Pair(nextY, nextX))
            }
        }
    }
    safeArea(virusArr)
}

fun safeArea(arr: Array<IntArray>) {
    var cnt = 0

    repeat(row) { i ->
        repeat(col) { j ->
            if(arr[i][j] == 0) cnt++
        }
    }

    result = maxOf(result, cnt)
}