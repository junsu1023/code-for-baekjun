import kotlin.math.sqrt

private val primeList = mutableListOf(0)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    eratosthenes(n)
    println(countSum(n))
}

private fun eratosthenes(n: Int) {
    val arr = BooleanArray(n + 1) { true }
    for(i in 2 .. sqrt(n.toDouble()).toInt()) {
        if(arr[i]) {
            var j = 2
            while(i * j <= n) {
                arr[i * j] = false
                j++
            }
        }
    }

    for(i in 2 .. n) {
        if(arr[i]) primeList.add(i + primeList.last())
    }
}

private fun countSum(n: Int): Int {
    var start = 0
    var end = 1
    var cnt = 0

    while(end < primeList.size) {
        val temp = primeList[end] - primeList[start]
        if(temp == n) {
            cnt++
            start++
            end++
        }
        else if(temp > n) start++
        else end++
    }
    return cnt
}
