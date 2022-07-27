import java.util.*

private lateinit var parent: IntArray
private val pq = PriorityQueue<Info>()
private var homeCnt = 0
private var roadCnt = 0

data class Info(val start: Int, val end: Int, val cost: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    homeCnt = st.nextToken().toInt()
    roadCnt = st.nextToken().toInt()

    parent = IntArray(homeCnt + 1)
    repeat(homeCnt + 1) { i -> parent[i] = i}

    repeat(roadCnt) { i ->
        val (start, end, cost) = readLine().split(" ").map { it.toInt() }
        pq.add(Info(start, end, cost))
    }

    println(kruskal())
}

private fun kruskal(): Int {
    var ans = 0
    var count = 0
    while(count != homeCnt - 2) {
        val cur = pq.poll()
        if(find(cur.start) != find(cur.end)) {
            union(cur.start, cur.end)
            ans += cur.cost
            count++
        }
    }

    return ans
}

private fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)

    parent[bParent] = aParent
}

private fun find(node: Int): Int {
    if(parent[node] != node) parent[node] = find(parent[node])
    return parent[node]
}