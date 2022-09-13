import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

private lateinit var graph: ArrayList<ArrayList<Int>>
private lateinit var degree: IntArray
private lateinit var runningTime: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) {
        val (buildingCnt, ruleCnt) = readLine().split(" ").map { it.toInt() }

        graph = ArrayList(ArrayList())
        repeat(buildingCnt + 1) { graph.add(ArrayList()) }

        degree = IntArray(buildingCnt + 1)
        runningTime = IntArray(buildingCnt + 1)

        val st = StringTokenizer(readLine())
        for(i in 1 .. buildingCnt) { runningTime[i] = st.nextToken().toInt() }

        repeat(ruleCnt) {
            val (first, second) = readLine().split(" ").map { it.toInt() }
            graph[first].add(second)
            degree[second]++
        }

        val targetBuilding = readLine().toInt()

        build(buildingCnt, targetBuilding)
    }
}

private fun build(n: Int, targetBuilding: Int) {
    val que: Queue<Int> = LinkedList()
    val result = IntArray(n + 1)

    for(i in 1 .. n) {
        result[i] = runningTime[i]

        if(degree[i] == 0) {
            que.add(i)
        }
    }

    while(que.isNotEmpty()) {
        val cur = que.poll()

        for(i in graph[cur]) {
            result[i] = max(result[i], result[cur] + runningTime[i])
            degree[i]--

            if(degree[i] == 0) que.add(i)
        }
    }

    println(result[targetBuilding])
}