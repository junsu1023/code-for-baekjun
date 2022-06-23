private lateinit var arr: Array<CharArray>
private lateinit var visited: Array<BooleanArray>
private lateinit var alpha: BooleanArray
private val dx = arrayOf(1, -1, 0, 0)
private val dy = arrayOf(0, 0, 1, -1)
private var ans = 0

fun main() = with(System.`in`.bufferedReader()) {
    val (row, col) = readLine().split(" ").map { it.toInt() }
    arr = Array(row) { CharArray(col) }
    visited = Array(row) { BooleanArray(col) }
    alpha = BooleanArray(27)

    repeat(row) { i ->
        val alphabets = readLine().toCharArray()
        repeat(col) { j ->
            arr[i][j] = alphabets[j]
        }
    }
    dfs(row, col, 0, 0, 1)
    println(ans)
}

private fun canMove(row: Int, col: Int, y: Int, x: Int): Boolean {
    if(y < 0 || y >= row || x < 0 || x >= col || alpha[arr[y][x].code - 65]) return false
    return true
}

private fun dfs(row: Int, col: Int, y: Int, x: Int, cnt: Int) {
    if(cnt > ans) ans = cnt

    alpha[arr[y][x].code - 65] = true
    for(i in 0 until 4) {
        val nextY = y + dy[i]
        val nextX = x + dx[i]
        if(canMove(row, col, nextY, nextX)) {
            dfs(row, col, nextY, nextX, cnt+1)
        }
    }
    alpha[arr[y][x].code - 65] = false
}