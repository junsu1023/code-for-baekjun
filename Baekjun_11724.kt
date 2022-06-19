private lateinit var arr: Array<IntArray>
private lateinit var visited: BooleanArray

fun main() = with(System.`in`.bufferedReader()) {
    val (nodeCnt, edgeCnt) = readLine().split(" ").map { it.toInt() }
    arr =  Array(nodeCnt + 1) { IntArray(nodeCnt + 1) }
    visited = BooleanArray(nodeCnt + 1)

    repeat(edgeCnt) {
        val(start, end) = readLine().split(" ").map { it.toInt() }
        arr[start][end] = 1
        arr[end][start] = 1
    }

    var cnt = 0
    for(i in 1 .. nodeCnt) {
        if(!visited[i]) {
            cnt++
            dfs(i, nodeCnt)
        }
    }

    println(cnt)
}

private fun dfs(node: Int, nodeCnt: Int) {
    visited[node] = true

    for(i in 1 .. nodeCnt) {
        if(arr[node][i] == 1 && !visited[i]) dfs(i, nodeCnt)
    }
}