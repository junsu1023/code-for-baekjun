import java.util.*
import kotlin.collections.ArrayList

data class Info(val from: Int, val to: Int, val dist: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = dist - other.dist
}

private lateinit var parent: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    parent = IntArray(n + 1)
    repeat(n + 1) { i -> parent[i] = i}

    val posX = ArrayList<Pair<Int, Int>>()
    val posY = ArrayList<Pair<Int, Int>>()
    val posZ = ArrayList<Pair<Int, Int>>()
    repeat(n) { i ->
        val (x, y, z) = readLine().split(" ").map { it.toInt() }
        posX.add(Pair(i, x))
        posY.add(Pair(i, y))
        posZ.add(Pair(i, z))
    }

    val sortedX = posX.sortedBy { it.second }
    val sortedY = posY.sortedBy { it.second }
    val sortedZ = posZ.sortedBy { it.second }

    val pq = PriorityQueue<Info>()
    for(i in 0 until n - 1) {
        pq.add(Info(sortedX[i].first, sortedX[i+1].first, sortedX[i+1].second - sortedX[i].second))
        pq.add(Info(sortedY[i].first, sortedY[i+1].first, sortedY[i+1].second - sortedY[i].second))
        pq.add(Info(sortedZ[i].first, sortedZ[i+1].first, sortedZ[i+1].second - sortedZ[i].second))
    }

    var ans = 0L
    while(pq.isNotEmpty()) {
        val cur = pq.poll()

        if(find(cur.from) != find(cur.to)) {
            union(cur.from, cur.to)
            ans += cur.dist
        }
    }

    println(ans)
}

private fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)

    parent[bParent] = aParent
}

private fun find(planet: Int): Int {
    if(parent[planet] != planet) parent[planet] = find(parent[planet])
    return parent[planet]
}