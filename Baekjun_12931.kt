import java.util.*

private var n = 0
private lateinit var arr: IntArray

fun main() {
    input()
    println(solve())
}

private fun input() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()
    arr = IntArray(n)
    val st = StringTokenizer(readLine())

    repeat(n) { i -> arr[i] = st.nextToken().toInt() }
}

private fun solve(): Int {
    var cnt = 0

    while(true) {
        repeat(n) { i ->
            if(arr[i] % 2 == 1) {
                arr[i]--
                cnt++
            }
        }

        if(!allZero()) {
            repeat(n) { i -> arr[i] /= 2 }
            cnt++
        }

        if(allZero()) break
    }
    return cnt
}

private fun allZero(): Boolean {
    repeat(n) { i ->
        if(arr[i] != 0) return false
    }
    return true
}