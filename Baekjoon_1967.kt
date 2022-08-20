private lateinit var tree: Array<ArrayList<Pair<Int, Int>>>
private lateinit var visited: BooleanArray
private var len = 0
private var endNode = 0

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    tree = Array(n + 1) { ArrayList() }
    visited = BooleanArray(n + 1)

    repeat(n - 1) {
        val (from, to, cost) = readLine().split(" ").map { it.toInt() }
        tree[from].add(Pair(to, cost))
        tree[to].add(Pair(from, cost))
    }

    dfs(1, 0)

    visited.fill(false)
    len = 0

    dfs(endNode, 0)
    println(len)
}

private fun dfs(node: Int, depth: Int) {
    if(visited[node]) return

    visited[node] = true
    if(len < depth) {
        len = depth
        endNode = node
    }

    for(i in tree[node].indices) {
        dfs(tree[node][i].first, depth + tree[node][i].second)
    }
}