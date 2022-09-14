import java.util.*
import kotlin.math.min

private lateinit var rgb: Array<IntArray>
private lateinit var dp: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    rgb = Array(3) { IntArray(n) }
    dp = Array(3) { IntArray(n) }

    repeat(n) { i ->
        val st = StringTokenizer(readLine())
        repeat(3) { j ->
            rgb[j][i] = st.nextToken().toInt()
        }
    }

    selectRgb(n)
}

private fun selectRgb(n: Int) {
    val max = 1000001
    var ans = 1000001

    for(i in 0 until 3) {
        for(j in 0 until 3) {
            dp[j][0] = max
        }

        dp[i][0] = rgb[i][0]

        for(j in 1 until n) {
            dp[0][j] = min(dp[1][j-1], dp[2][j-1]) + rgb[0][j]
            dp[1][j] = min(dp[0][j-1], dp[2][j-1]) + rgb[1][j]
            dp[2][j] = min(dp[0][j-1], dp[1][j-1]) + rgb[2][j]
        }

        for(j in 0 until 3) {
            if(i == j) continue
            ans = min(ans, dp[j][n-1])
        }
    }

    println(ans)
}