fun main() = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    val dp = IntArray(1000001)
    dp[0] = 0
    dp[1] = 1
    for(i in 2 .. 1000000) dp[i] = dp[i-2] % 1000000000 + dp[i-1]  % 1000000000
    if(n < 0) {
        n = -n
        if(n % 2 == 0) println("-1\n${dp[n] % 1000000000}")
        else println("1\n${dp[n] % 1000000000}")
    }
    else if(n > 0) println("1\n${dp[n] % 1000000000}")
    else println("0\n0")
}