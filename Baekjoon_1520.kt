import java.util.*

private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var row = 0
private var col = 0
private lateinit var map: Array<IntArray>
private lateinit var check: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    row = st.nextToken().toInt()
    col = st.nextToken().toInt()

    map = Array(row + 1) { IntArray(col + 1) }
    check = Array(row + 1) { IntArray(col + 1) { -1 } }
    for(i in 1 .. row) {
        st = StringTokenizer(readLine())
        for(j in 1 .. col) {
            map[i][j] = st.nextToken().toInt()
        }
    }

    println(dfs(1, 1))
}

private fun dfs(y: Int, x: Int): Int {
    if(y == row && x == col) return 1

    if(check[y][x] == -1) {
        check[y][x] = 0
        for(i in 0 until 4) {
            val nextY = y + dy[i]
            val nextX = x + dx[i]

            if(nextY !in 1 .. row || nextX !in 1 ..col) continue
            if(map[nextY][nextX] < map[y][x]) check[y][x] += dfs(nextY, nextX)
        }
    }

    return check[y][x]
}