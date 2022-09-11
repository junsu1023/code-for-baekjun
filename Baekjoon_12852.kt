import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val dp = IntArray(n + 1) { i -> i }

    for(i in 2 .. n) {
        if(i % 3 == 0) dp[i] = min(dp[i], dp[i/3])
        if(i % 2 == 0) dp[i] = min(dp[i], dp[i/2])
        dp[i] = min(dp[i], dp[i-1]) + 1
    }

    println(dp[n] - 1)

    var temp = n
    while(temp != 0) {
        print("$temp ")
        if(dp[temp] == dp[temp-1] + 1) temp -= 1
        else if(temp % 2 == 0 && dp[temp] == dp[temp/2] + 1) temp /= 2
        else if(temp % 3 == 0 && dp[temp] == dp[temp/3] + 1) temp /= 3
    }
}