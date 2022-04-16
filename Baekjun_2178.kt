import java.util.*

val dx = arrayOf(1, -1, 0, 0)
val dy = arrayOf(0, 0, 1, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val miro = Array(n) { IntArray(m) { 0 } }
    for (i in 0 until n) {
        val area = readLine()
        for(j in 0 until m) {
            miro[i][j] = area[j].toString().toInt()
        }
    }
    val visit = Array(n) { BooleanArray(m) { false } }
    visit[0][0] = true
    bfs(miro, visit, 0, 0, n, m)
    println(miro[n-1][m-1])
}

fun bfs(miro: Array<IntArray>, visit: Array<BooleanArray>, x: Int, y: Int, n: Int, m: Int) {
    val que: Queue<IntArray> = LinkedList()
    que.add(intArrayOf(x, y))
    while(!que.isEmpty()) {
        val now = que.poll()
        val nowX = now[0]
        val nowY = now[1]
        for(i in 0 until 4) {
            val nextX = nowX + dx[i]
            val nextY = nowY + dy[i]
            if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || visit[nextX][nextY] || miro[nextX][nextY] == 0) continue;
            que.add(intArrayOf(nextX, nextY));
            miro[nextX][nextY] = miro[nowX][nowY] + 1
            visit[nextX][nextY] = true
        }
    }
}