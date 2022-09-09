import java.util.*
import kotlin.math.abs

private lateinit var liquid: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    liquid = IntArray(n)

    val st = StringTokenizer(readLine())
    repeat(n) { i ->
        liquid[i] = st.nextToken().toInt()
    }

    liquid.sort()

    binarySearch()
}

private fun binarySearch() {
    var left = 0
    var right = liquid.size - 1
    val ans = IntArray(2)

    var standard = Integer.MAX_VALUE
    while(left < right) {
        val liquidSum = liquid[left] + liquid[right]

        if(abs(liquidSum) < standard) {
            standard = abs(liquidSum)
            ans[0] = liquid[left]
            ans[1] = liquid[right]
        }

        if(liquidSum < 0) left++
        else right--
    }

    println("${ans[0]} ${ans[1]}")
}