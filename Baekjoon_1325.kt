private lateinit var graph: Array<ArrayList<Int>>
private lateinit var visited: IntArray
private lateinit var hacking: IntArray
private var max = 0

fun main() = with(System.`in`.bufferedReader()){
    val (computerCnt, trustCnt) = readLine().split(" ").map { it.toInt() }

    graph = Array(computerCnt + 1) { ArrayList() }
    hacking = IntArray(computerCnt + 1)

    repeat(trustCnt) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        graph[a].add(b)
    }

    for(i in 1 .. computerCnt) {
        visited = IntArray(computerCnt + 1)
        visited[i]++
        dfs(i)
    }

    for(i in 1 .. computerCnt) {
        if(hacking[i] == max) print("$i ")
    }
}

private fun dfs(n: Int) {
    hacking[n]++
    max = maxOf(max, hacking[n])

    for(i in graph[n].indices) {
        val nextComputer = graph[n][i]
        if(visited[nextComputer] == 0) {
            visited[nextComputer]++
            dfs(nextComputer)
        }
    }
}