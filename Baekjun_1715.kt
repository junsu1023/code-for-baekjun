import java.util.*

val pq = PriorityQueue<Int>()
fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    repeat(n) {
        pq.add(readLine().toInt())
    }

    println(solve())
}

fun solve(): Int {
    var sum = 0

    while(pq.size != 1) {
        val (n1, n2) = pq.poll() to pq.poll()
        sum += n1 + n2
        pq.add(n1 + n2)
    }
    return sum
}