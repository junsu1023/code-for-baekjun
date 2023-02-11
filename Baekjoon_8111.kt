import java.util.*

private lateinit var visited: BooleanArray

fun main() {
    repeat(readLine()!!.toInt()) {
        val n = readLine()!!.toInt()
        visited = BooleanArray(20001)

        if(n == 1) println(1)
        else bfs(n)
    }
}

private fun bfs(n: Int) {
    val nextNum = intArrayOf(0, 0)
    val nextString = arrayOf("", "")
    val que: Queue<Pair<Int, String>> = LinkedList()

    que.add(Pair(1, "1"))
    visited[1] = true

    while(que.isNotEmpty()) {
        val now = que.poll()
        val num = now.first
        val string = now.second

        if(num == 0) {
            println(string)
            return
        }

        nextNum[0] = (num * 10) % n
        nextString[0] = string + '0'

        nextNum[1] = (num * 10 + 1) % n
        nextString[1] = string + '1'

        repeat(2) {
            if(visited[nextNum[it]]) return@repeat
            visited[nextNum[it]] = true
            que.add(Pair(nextNum[it], nextString[it]))
        }
    }

    println("BRAK")
}