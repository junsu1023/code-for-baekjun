import java.lang.Math.pow
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

private lateinit var parent: IntArray

data class Info(val start: Int, val end: Int, val distance: Double): Comparable<Info> {
    override fun compareTo(other: Info): Int {
        if(distance > other.distance) return 1
        return -1
    }
}

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    parent = IntArray(n + 1)
    repeat(n) { i -> parent[i] = i }

    val edgeCnt = n * (n - 3) / 2 + n
    val arr = Array(n) { Pair(0.0, 0.0) }
    repeat(n) { i ->
        val pos = readLine().split(" ").map { it.toDouble() }
        arr[i] = Pair(pos[0], pos[1])
    }

    val pq = PriorityQueue<Info>()
    for(i in 0 until n) {
        for(j in i + 1 until n){
            val distance = sqrt((arr[j].first - arr[i].first).pow(2) + (arr[j].second - arr[i].second).pow(2))
            pq.add(Info(i, j, distance))
        }
    }

    var ans = 0.0
    repeat(edgeCnt) {
        val cur = pq.poll()
        if(find(cur.start) != find(cur.end)) {
            union(cur.start, cur.end)
            ans += cur.distance
        }
    }

    println(String.format("%.2f", ans))
}

private fun union(a: Int, b: Int) {
    val aParent = find(a)
    val bParent = find(b)

    parent[bParent] = aParent
}

private fun find(i: Int): Int {
    if(parent[i] != i) parent[i] = find(parent[i])
    return parent[i]
}