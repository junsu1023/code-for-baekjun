import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    val n = readLine().toInt()
    repeat(n) {
        val command = readLine().toInt()
        if(command == 0) {
            if(pq.size == 0) println(0)
            else println(pq.poll())
        }
        else pq.add(command)
    }
}