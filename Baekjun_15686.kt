import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

private var n = 0
private var m = 0
private var ans = Int.MAX_VALUE
private val home = ArrayList<Pair<Int, Int>>()
private val chicken = ArrayList<Pair<Int, Int>>()
private lateinit var map: Array<IntArray>
private lateinit var visited: BooleanArray

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()

    map = Array(n) { IntArray(n) }
    visited = BooleanArray(13)

    repeat(n) { i ->
        st = StringTokenizer(readLine())
        repeat(n) { j ->
            map[i][j] = st.nextToken().toInt()
            if(map[i][j] == 1) home.add(Pair(i, j))
            else if(map[i][j] == 2) chicken.add(Pair(i, j))
        }
    }

    dfs(0, 0)
    println(ans)
}

private fun dfs(idx: Int, cnt: Int) {
    if(cnt == m) {
        var totalDistance = 0
        for(i in home.indices) {
            var dist = Int.MAX_VALUE
            for(j in chicken.indices) {
                if(visited[j]) dist = minOf(dist, distance(home[i], chicken[j]))
            }

            totalDistance += dist
        }

        ans = minOf(ans, totalDistance)
        return
    }

    if(idx == chicken.size) return

    visited[idx] = true
    dfs(idx + 1, cnt + 1)
    visited[idx] = false
    dfs(idx + 1, cnt)

}

private fun distance(house: Pair<Int, Int>, chicken: Pair<Int, Int>): Int {
    return abs(house.first - chicken.first) + abs(house.second - chicken.second)
}