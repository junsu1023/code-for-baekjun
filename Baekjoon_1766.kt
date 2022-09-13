import java.util.*
import kotlin.collections.ArrayList

private lateinit var degree: IntArray
private val graph = ArrayList<ArrayList<Int>>()

fun main() = with(System.`in`.bufferedReader()) {
    val (problemCnt, infoCnt) = readLine().split(" ").map { it.toInt() }
    degree = IntArray(problemCnt + 1)

    repeat(problemCnt + 1) {
        graph.add(ArrayList())
    }

    repeat(infoCnt) {
        val priority = readLine().split(" ").map { it.toInt() }
        graph[priority[0]].add(priority[1])
        degree[priority[1]]++
    }

    topologicalSort(problemCnt)
}

private fun topologicalSort(n: Int) {
    val result = ArrayList<Int>()
    val pq = PriorityQueue<Int>()

    for(i in 1 .. n) {
        if(degree[i] == 0) pq.add(i)
    }

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        result.add(cur)

        for(next in graph[cur]) {
            degree[next]--

            if(degree[next] == 0) pq.add(next)
        }
    }

    for(i in result) print("$i ")
}