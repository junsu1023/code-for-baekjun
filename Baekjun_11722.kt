import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n)
    val st = StringTokenizer(readLine())
    repeat(n) { i -> arr[i] = st.nextToken().toInt() }
    val dp = IntArray(n)
    for(i in 0 until n) {
        if(dp[i] == 0) dp[i] = 1
        for(j in 0 until i) {
            if(arr[i] < arr[j]) {
                if(dp[i] < dp[j] + 1) dp[i] = dp[j] + 1
            }
        }
    }
    dp.sort()
    println(dp[n-1])
}