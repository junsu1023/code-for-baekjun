import java.util.*
import kotlin.collections.ArrayList

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) {
        val sb = StringBuilder()

        val n = readLine().toInt()
        sb.append("${(n + 1) / 2}\n")

        val arr = ArrayList<Int>()
        var cnt = 0
        var st = StringTokenizer(readLine())

        for(i in 0 until n) {
            if(i!= 0 && i % 10 == 0) st = StringTokenizer(readLine())
            val num = st.nextToken().toInt()
            arr.add(num)
            arr.sort()

            if(i % 2 == 0) {
                if(cnt == 9) {
                    sb.append("${arr[i/2]}\n")
                    cnt = 0
                }
                else sb.append("${arr[i/2]} ")
                cnt++
            }
        }
        println(sb.toString())
    }
}