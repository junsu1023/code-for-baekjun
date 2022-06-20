import java.util.*

private lateinit var arr: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private val dx = arrayOf(1, -1, 0, 0, 1, -1, -1, 1)
private val dy = arrayOf(0, 0, 1, -1, 1, 1, -1, -1)

fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val (weight, height) = readLine().split(" ").map { it.toInt() }
        if(weight == 0 && height == 0) break

        arr = Array(height) { IntArray(weight) }
        visited = Array(height) { BooleanArray(weight) }

        repeat(height) { i ->
            val st = StringTokenizer(readLine())
            repeat(weight) { j ->
                arr[i][j] = st.nextToken().toInt()
            }
        }

        var cnt = 0
        repeat(height) { i ->
            repeat(weight) { j ->
                if(arr[i][j] == 1 && !visited[i][j]) {
                    cnt++
                    dfs(weight, height, i, j)
                }
            }
        }
        println(cnt)
    }
}

private fun dfs(weight: Int, height: Int, y: Int, x: Int) {
    for(i in 0 until 8) {
        val nextY = y + dy[i]
        val nextX = x + dx[i]

        if(nextY < 0 || nextY >= height || nextX < 0 || nextX >= weight || visited[nextY][nextX] || arr[nextY][nextX] == 0) continue
        visited[nextY][nextX] = true
        dfs(weight, height, nextY, nextX)
    }
}