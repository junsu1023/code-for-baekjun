import java.util.*

private lateinit var parent: IntArray

data class Element(val start: Int, val end: Int, val cost: Int): Comparable<Element> {
    override fun compareTo(other: Element): Int = cost - other.cost
}

fun main() = with(System.`in`.bufferedReader()) {
    val (nodeCnt, edgeCnt) = readLine().split(" ").map { it.toInt() }
    parent = IntArray(nodeCnt + 1)
    repeat(nodeCnt) { i -> parent[i] = i }

    val pq = PriorityQueue<Element>()
    repeat(edgeCnt) {
        val (start, end, cost) = readLine().split(" ").map { it.toInt() }
        pq.add(Element(start, end, cost))
    }

    var ans = 0
    repeat(edgeCnt) { i ->
        val ele = pq.poll()
        if(find(ele.start) != find(ele.end)) {
            union(ele.start, ele.end)
            ans += ele.cost
        }
    }

    println(ans)
}

private fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)

    if(aParent != bParent) parent[bParent] = aParent
}

private fun find(i: Int): Int {
    if(parent[i] != i) parent[i] = find(parent[i])
    return parent[i]
}