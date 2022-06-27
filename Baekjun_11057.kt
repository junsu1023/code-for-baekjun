lateinit var dp: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    dp = Array(n+1) { IntArray(10) }
    dp(n)
}

fun dp(n: Int) {
    repeat(10) { i -> dp[1][i] = 1 }

    for(i in 2 .. n) {
        for(j in 0 until 10) {
            for(k in 0 .. j) {
                dp[i][j] = dp[i][j] + dp[i-1][k]
                dp[i][j] %= 10007
            }
        }
    }

    var ans = 0
    repeat(10) { i ->
        ans += dp[n][i]
    }
    ans %= 10007
    println(ans)
}