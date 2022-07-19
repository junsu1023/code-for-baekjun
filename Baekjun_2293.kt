fun main() = with(System.`in`.bufferedReader()) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)
    repeat(n) { i -> arr[i] = readLine().toInt() }

    val dp = IntArray(10001)
    dp[0] = 1
    for(i in 0 until n) {
        for(j in arr[i]..k) {
            dp[j] = dp[j] + dp[j - arr[i]]
        }
    }
    println(dp[k])
}