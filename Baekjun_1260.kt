import java.util.*

lateinit var visited: BooleanArray
lateinit var arr: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()){
    val (nodeCnt, edgeCnt, startNode) = readLine().split(" ").map { it.toInt() }
    arr = Array(nodeCnt+1) { IntArray(nodeCnt+1) }
    visited = BooleanArray(nodeCnt+1)
    for(i in 0 until edgeCnt) {
        val (node1, node2) = readLine().split(" ").map { it.toInt() }
        arr[node1][node2] = 1
        arr[node2][node1] = 1
    }
    dfs(startNode, nodeCnt)
    println()
    for(i in 0 .. nodeCnt) visited[i] = false
    bfs(startNode, nodeCnt)
}

fun dfs(now: Int, nodeCnt: Int) {
    print("$now ")
    visited[now] = true
    for(i in 1 .. nodeCnt) {
        if(arr[now][i] == 1 && !visited[i]) {
            dfs(i, nodeCnt)
        }
    }
    return
}

fun bfs(now: Int, nodeCnt: Int) {
    print("$now ")
    visited[now] = true
    val que: Queue<Int> = LinkedList()
    que.offer(now)
    while(!que.isEmpty()) {
        val top = que.poll()
        for(i in 1 .. nodeCnt) {
            if(arr[top][i] == 1 && !visited[i]) {
                print("$i ")
                que.offer(i)
                visited[i] = true
            }
        }
    }
    return
}