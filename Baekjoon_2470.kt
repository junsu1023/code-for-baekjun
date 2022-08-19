import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val list = ArrayList<Int>(n)

    val st  = StringTokenizer(readLine())
    repeat(n) { list.add(st.nextToken().toInt()) }

    list.sort()

    var start = 0
    var end = n-1
    var min = Integer.MAX_VALUE
    var a = 0
    var b = 0
    while(start < end) {
        val sum = list[start] + list[end]
        if(abs(sum) < min) {
            min = abs(sum)
            a = list[start]
            b = list[end]

            if(sum == 0) break
        }

        if(sum < 0) start++
        else end--
    }

    println("$a $b")
}