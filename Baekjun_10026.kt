private lateinit var arr: Array<CharArray>
private lateinit var visited: Array<BooleanArray>
private val dx = arrayOf(1, -1, 0, 0)
private val dy = arrayOf(0, 0, 1, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    arr = Array(n) { CharArray(n) }
    visited = Array(n) { BooleanArray(n) }

    repeat(n) { i ->
        val colors = readLine().toCharArray()
        repeat(n) { j ->
            arr[i][j] = colors[j]
        }
    }

    var cnt = 0
    repeat(n) { i ->
        repeat(n) { j ->
            if(!visited[i][j]) {
                dfs(n, i, j)
                cnt++
            }
        }
    }

    println("$cnt ${redToGreen(n)}")
}

private fun dfs(n: Int, y: Int, x: Int) {
    visited[y][x] = true
    for(i in 0 until 4) {
        val nextY = y + dy[i]
        val nextX = x + dx[i]

        if(nextY < 0 || nextY >= n || nextX < 0 || nextX >= n) continue
        if(visited[nextY][nextX] || arr[y][x] != arr[nextY][nextX]) continue
        dfs(n, nextY, nextX)
    }
}

private fun redToGreen(n: Int): Int {
    repeat(n) { i ->
        repeat(n) { j ->
            visited[i][j] = false
        }
    }

    repeat(n) { i ->
        repeat(n) { j ->
            if(arr[i][j] == 'R') arr[i][j] = 'G'
        }
    }

    var cnt = 0
    repeat(n) { i ->
        repeat(n) { j ->
            if(!visited[i][j]) {
                cnt++
                dfs(n, i, j)
            }
        }
    }

    return cnt
}