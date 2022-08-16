import java.util.*
import kotlin.collections.ArrayList

private lateinit var color: IntArray
private lateinit var graph: Array<ArrayList<Int>>

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) {
        val (nodeCnt, edgeCnt) = readLine().split(" ").map { it.toInt() }
        graph = Array(nodeCnt + 1) { ArrayList() }
        color = IntArray(nodeCnt + 1)

        repeat(edgeCnt) {
            val (from, to) = readLine().split(" ").map { it.toInt() }
            graph[from].add(to)
            graph[to].add(from)
        }

        if(bipartiteGraph(nodeCnt)) println("YES")
        else println("NO")
    }
}

private fun bipartiteGraph(n: Int): Boolean {
    val que: Queue<Int> = LinkedList()

    for(i in 1 ..n) {
        if(color[i] == 0) {
            que.add(i)
            color[i] = 1
        }

        while(que.isNotEmpty()) {
            val cur = que.poll()
            val curColor = color[cur]

            for(j in graph[cur].indices) {
                val nextColor = color[graph[cur][j]]
                if(nextColor == 0) que.add(graph[cur][j])
                if(nextColor == color[cur]) return false
                if(curColor == 1 && nextColor == 0) color[graph[cur][j]] = 2
                else if(curColor == 2 && nextColor == 0) color[graph[cur][j]] = 1
            }
        }
    }

    return true
}