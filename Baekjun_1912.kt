import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n)
    val st = StringTokenizer(readLine())
    for(i in 0 until n) arr[i] = st.nextToken().toInt()
    println(divideConquer(arr, 0, n-1))
}
fun divideConquer(arr: IntArray, start: Int, end: Int): Int {
    if(start == end) return arr[start]
    val mid = (start + end) / 2
    var left = Int.MIN_VALUE
    var right = Int.MIN_VALUE
    var sum = 0
    for(i in mid downTo start) {
        sum += arr[i]
        left = maxOf(left, sum)
    }
    sum = 0
    for(i in mid + 1 .. end) {
        sum += arr[i]
        right = maxOf(right, sum)
    }
    val side = maxOf(divideConquer(arr, start, mid), divideConquer(arr, mid+1, end))
    return maxOf(left + right, side)
}