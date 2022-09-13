import java.util.*
import kotlin.math.abs

private lateinit var liquid: LongArray

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    liquid = LongArray(n)

    val st = StringTokenizer(readLine())
    repeat(n) { i -> liquid[i] = st.nextToken().toLong() }

    liquid.sort()

    val ans = selectLiquid(n)

    for(i in ans) print("$i ")
}

private fun selectLiquid(n: Int): LongArray {
    var standard = Long.MAX_VALUE
    val ans = LongArray(3)

    for(i in 0 until n -2) {
        var low = i + 1
        var high = n - 1

        while(low < high) {
            val mixLiquid = liquid[i] + liquid[low] + liquid[high]

            if(standard > abs(mixLiquid)) {
                standard = abs(mixLiquid)
                ans[0] = liquid[i]
                ans[1] = liquid[low]
                ans[2] = liquid[high]
            }

            if(mixLiquid < 0) low++
            else high--
        }
    }

    return ans
}