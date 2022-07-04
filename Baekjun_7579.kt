import java.util.*

private lateinit var dp: Array<IntArray>
fun main() = with(System.`in`.bufferedReader()) {
    val (appCnt, totalMemory) = readLine().split(" ").map { it.toInt() }

    val activateMemory = IntArray(appCnt + 1)
    var st = StringTokenizer(readLine())
    repeat(appCnt) { i -> activateMemory[i+1] = st.nextToken().toInt()}

    val disableCost = IntArray(appCnt + 1)
    var totalCost = 0
    st = StringTokenizer(readLine())
    repeat(appCnt) { i ->
        disableCost[i+1] = st.nextToken().toInt()
        totalCost += disableCost[i+1]
    }

    dp = Array(appCnt+1) { IntArray(10001) }

    var ans = 0
    for(i in 1 .. appCnt) {
        for(j in 0..totalCost) {
            if(disableCost[i] <= j) dp[i][j] = maxOf(dp[i-1][j], dp[i-1][j - disableCost[i]] + activateMemory[i])
            dp[i][j] = maxOf(dp[i][j], dp[i-1][j])
        }
    }

    for(i in 0 .. totalCost) {
        if(dp[appCnt][i] >= totalMemory) {
            println(i)
            break
        }
    }
}