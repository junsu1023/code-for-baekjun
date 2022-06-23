import java.util.*

private lateinit var visited: BooleanArray
private var ans = 0
private var cnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    val (subinIdx, brotherIdx) = readLine().split(" ").map { it.toInt() }
    visited = BooleanArray(100001)

    bfs(subinIdx, brotherIdx)

    println(ans)
    println(cnt)
}

private fun bfs(subinIdx: Int, brotherIdx: Int) {
    val que: Queue<IntArray> = LinkedList()
    que.add(intArrayOf(subinIdx, 0))
    visited[subinIdx] = true

    while(!que.isEmpty()) {
        val idx = que.peek()[0]
        val moveCnt = que.peek()[1]
        que.poll()
        visited[idx] = true

        if(ans != 0 && idx == brotherIdx && ans == moveCnt) cnt++

        if(ans == 0 && idx == brotherIdx) {
            ans = moveCnt
            cnt++
        }

        if(idx - 1 in 0..100000 && !visited[idx - 1]) que.add(intArrayOf(idx -1, moveCnt + 1))
        if(idx + 1 in 0 .. 100000 && !visited[idx + 1]) que.add(intArrayOf(idx + 1, moveCnt + 1))
        if(idx * 2 in 0 .. 100000 && !visited[idx * 2]) que.add(intArrayOf(idx * 2, moveCnt + 1))
    }
}