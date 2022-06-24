import java.util.*

private lateinit var visited: BooleanArray
private var ans = 0

data class Info (val time: Int, val idx: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = time - other.time
}

fun main() = with(System.`in`.bufferedReader()) {
    val (subinIdx, brotherIdx) = readLine().split(" ").map { it.toInt() }
    visited = BooleanArray(100001)

    subinMove(subinIdx, brotherIdx)
    println(ans)
}

private fun subinMove(subinIdx: Int, brotherIdx: Int) {
    val que = PriorityQueue<Info>()
    que.add(Info(0, subinIdx))
    visited[subinIdx] = true

    while(!que.isEmpty()) {
        val time = que.peek().time
        val idx = que.peek().idx
        visited[idx] = true
        que.poll()

        if(idx == brotherIdx) {
            ans = time
            return
        }

        if(idx * 2 in 0..100000 && !visited[idx * 2]) que.add(Info(time, idx * 2))
        if(idx + 1 in 0..100000 && !visited[idx + 1]) que.add(Info(time + 1, idx + 1))
        if(idx - 1 in 0..100000 && !visited[idx - 1]) que.add(Info(time + 1, idx - 1))
    }
}