import java.util.*

private lateinit var map: Array<IntArray>
private lateinit var road: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    map = Array(n + 1) { IntArray(n + 1) }
    road = Array(n + 1) { IntArray(n + 1) }

    for(i in 1 .. n) {
        val st = StringTokenizer(readLine())
        for(j in 1 .. n) {
            map[i][j] = st.nextToken().toInt()
            road[i][j] = map[i][j]
        }
    }

    if(!reverseFloyd(n)) println(-1)
    else {
        var ans = 0
        for (i in 1..n) {
            for (j in 1..n) {
                ans += road[i][j]
            }
        }

        ans /= 2
        println(ans)
    }
}

private fun reverseFloyd(n: Int): Boolean {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                if(i == k || j == k) continue

                if(map[i][j] > map[i][k] + map[k][j]) return false
                if(map[i][j] == map[i][k] + map[k][j]) road[i][j] = 0
            }
        }
    }

    return true
}