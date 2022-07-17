import java.util.*

private var n = 0
private var m = 0
private var totalCnt = 0
private val path: Deque<Int> = LinkedList()
private val route = IntArray(100001)
private val visited = BooleanArray(100001)

fun main() {
    input()
    find()
    println(totalCnt)
    while(path.isNotEmpty()) print("${path.pollLast()} ")
}

private fun input() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
}

private fun find() {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(n, 0))
    visited[n] = true

    while(que.isNotEmpty()) {
        val idx = que.peek().first
        val cnt = que.peek().second
        que.poll()

        if(idx == m) {
            var temp = idx

            while(temp != n) {
                path.add(temp)
                temp = route[temp]
            }
            path.add(n)
            totalCnt = cnt

            return
        }

        if(idx + 1 in 0 until 100001 && !visited[idx + 1]) {
            que.add(Pair(idx + 1, cnt + 1))
            visited[idx + 1] = true
            route[idx + 1] = idx
        }
        if(idx - 1 in 0 until 100001 && !visited[idx - 1]) {
            que.add(Pair(idx - 1, cnt + 1))
            visited[idx - 1] = true
            route[idx - 1] = idx
        }
        if(idx * 2 in 0 until 100001 && !visited[idx * 2]) {
            que.add(Pair(idx * 2, cnt + 1))
            visited[idx * 2] = true
            route[idx * 2] = idx
        }
    }
}