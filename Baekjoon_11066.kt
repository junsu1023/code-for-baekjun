import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        val n = readLine().toInt()
        val st = StringTokenizer(readLine())
        val sum = IntArray(n + 1)
        val dp = Array(n + 1) { IntArray(n + 1) }

        for(i in 1 .. n) {
            sum[i] = sum[i-1] + st.nextToken().toInt()
        }

        for(i in 1 .. n) {
            for(j in 1 .. n-i) {
                dp[j][i+j] = Integer.MAX_VALUE
                for(k in j until i + j) {
                    dp[j][i+j] = minOf(dp[j][i + j], dp[j][k] + dp[k + 1][i + j] + sum[i + j] - sum[j - 1])
                }
            }
        }

        println(dp[1][n])
    }
}