import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val (n, q) = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n + 1)
    arr[0] = 0
    val point = IntArray(n + 1)
    val st = StringTokenizer(readLine())
    for(i in 1 .. n) arr[i] = st.nextToken().toInt()
    arr.sort()
    point[0] = 0
    for(i in 1 .. n) point[i] = point[i-1] + arr[i]
    repeat(q) {
        val (start, end) = readLine().split(" ").map { it.toInt() }
        val ans = point[end] - point[start - 1]
        sb.append(ans).append("\n")
    }
    println(sb.toString())
}