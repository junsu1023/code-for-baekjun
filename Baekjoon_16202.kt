import java.lang.StringBuilder
import java.util.*

data class Info(val start: Int, val end: Int, val cost: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = cost - other.cost
}

private lateinit var parent: IntArray
private val list = ArrayList<Info>()

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var (nodeCnt, edgeCnt, k) = readLine().split(" ").map { it.toInt() }

    var pq = PriorityQueue<Info>()
    for(i in 1 .. edgeCnt) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        pq.add(Info(start, end, i))
    }

    var isZero = false
    for(i in 0 until k) {
        if(isZero) {
            sb.append("0 ".repeat(k - i))
            break
        }

        var getMst = kruskal(nodeCnt, pq)
        if(getMst == 0) isZero = true
        sb.append("$getMst ")

        list.removeFirst()
        pq.addAll(list)
        list.clear()
    }
    println(sb.toString())
}

private fun kruskal(n: Int, pq: PriorityQueue<Info>): Int {
    parent = IntArray(n + 1) { i -> i }
    var cost = 0
    var cnt = 0

    while(pq.isNotEmpty()) {
        val cur = pq.poll()

        if (find(cur.start) != find(cur.end)) {
            union(cur.start, cur.end)
            cost += cur.cost
            cnt++
        }
        list.add(cur)
    }

    if(cnt == n - 1) return cost
    return 0
}

private fun union(a: Int, b: Int) {
    val aRoot = find(a)
    val bRoot = find(b)

    parent[bRoot] = aRoot
}

private fun find(node: Int): Int {
    if(parent[node] != node) parent[node] = find(parent[node])
    return parent[node]
}