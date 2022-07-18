import java.util.*

private lateinit var arr: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private val dy = intArrayOf(1, 1, 1, -1, -1, -1, 0, 0)
private val dx = intArrayOf(1, 0, -1, 1, 0, -1, 1, -1)
private var temp = true
private var n = 0
private var m = 0

fun main() {
    input()

    for(i in 0 until n) {
        for(j in 0 until m) {
            if(!visited[i][j]) {
                visited[i][j] = true
                check(i, j)
            }
        }
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()

    arr = Array(n) { IntArray(m) }
    visited = Array(n) { BooleanArray(m) }

    repeat(n) { i ->
        st = StringTokenizer(readLine())
        repeat(m) { j ->
            arr[i][j] = st.nextToken().toInt()
        }
    }

    var cnt = 0
    repeat(n) { i ->
        repeat(m){ j ->
            if(!visited[i][j]){
                temp = true
                check(i, j)
                if(temp) cnt++
            }
        }
    }
    println(cnt)
}

private fun check(y: Int, x: Int) {
    for(i in 0 until 8) {
        val ny = y + dy[i]
        val nx = x + dx[i]
        if(ny in 0 until n&& nx in 0 until m) {
            if(arr[y][x] < arr[ny][nx]) temp = false
            if(!visited[ny][nx] && arr[y][x] == arr[ny][nx]) {
                visited[ny][nx] = true
                check(ny, nx)
            }
        }
    }
}