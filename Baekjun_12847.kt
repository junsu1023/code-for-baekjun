import java.util.*

fun main()  = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val wage = IntArray(n)
    val dp = LongArray(n + 1)
    val st = StringTokenizer(readLine())
    repeat(n) { i ->
        wage[i] = st.nextToken().toInt()
        if(i != 0) dp[i] = wage[i-1].toLong()
    }
    repeat(n) {
        if(it != 0) {
            dp[it] = dp[it] + dp[it - 1]
        }
    }
    var totalWage = 0L
    for(i in m .. n) {
        if(totalWage <= dp[i] - dp[i-m]) totalWage = dp[i] - dp[i-m]
    }
    println(totalWage)
}