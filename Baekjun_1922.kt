import java.util.*

data class Info(val start: Int, val end: Int, val cost: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = cost - other.cost
}

private lateinit var parent: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val computerCnt = readLine().toInt()
    val edgeCnt = readLine().toInt()

    parent = IntArray(computerCnt + 1)
    for(i in 1 .. computerCnt) parent[i] = i

    val pq = PriorityQueue<Info>()
    repeat(edgeCnt) {
        val (start, end, cost) = readLine().split(" ").map { it.toInt() }
        pq.add(Info(start, end, cost))
    }

    var minCost = 0
    for(i in 0 until edgeCnt) {
        val info: Info = pq.poll()
        if(find(info.start) != find(info.end)) {
            union(info.start, info.end)
            minCost += info.cost
        }
    }

    println(minCost)
}

private fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)

    if(aParent != bParent) {
        parent[bParent] = aParent
    }
}

private fun find(i: Int): Int {
    if(parent[i] != i) {
        parent[i] = find(parent[i])
    }
    return parent[i]
}