import java.util.*
import kotlin.collections.ArrayList

private lateinit var graph: ArrayList<ArrayList<Int>>
private lateinit var degree: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val (singerCnt, pdCnt) = readLine().split(" ").map { it.toInt() }

    graph = ArrayList(ArrayList())
    repeat(singerCnt + 1) {
        graph.add(ArrayList())
    }

    degree = IntArray(singerCnt + 1)

    repeat(pdCnt) {
        val st = StringTokenizer(readLine())
        val cnt = st.nextToken().toInt()
        var priority = st.nextToken().toInt()

        repeat(cnt - 1) {
            val next = st.nextToken().toInt()
            graph[priority].add(next)
            degree[next]++

            priority = next
        }
    }

    topologicalSort(singerCnt)
}

private fun topologicalSort(n: Int) {
    val result = ArrayList<Int>()
    val que: Queue<Int> = LinkedList()

    for(i in 1 .. n) {
        if(degree[i] == 0) que.add(i)
    }

    while(que.isNotEmpty()) {
        val cur = que.poll()
        result.add(cur)

        for(next in graph[cur]) {
            degree[next]--

            if(degree[next] == 0) que.add(next)
        }
    }

    if(result.size != n) println(0)

    for(i in result) println(i)
}