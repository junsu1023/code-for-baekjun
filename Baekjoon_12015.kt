import java.util.*

private lateinit var arr: IntArray
private lateinit var makeLis: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    arr = IntArray(n)
    makeLis = IntArray(n)

    val st = StringTokenizer(readLine())
    repeat(n) { i -> arr[i] = st.nextToken().toInt() }

    lis(n)
}

private fun lis(n: Int) {
    makeLis[0] = arr[0]
    var len = 1

    for(i in 1 until n) {
        val next = arr[i]

        if(next > makeLis[len - 1]) {
            makeLis[len] = next
            len++
        }
        else {
            var low = 0
            var high = len

            while(low < high) {
                val mid = (low + high) / 2

                if(makeLis[mid] < next) low = mid + 1
                else high = mid
            }

            makeLis[low] = next
        }
    }

    println(len)
}