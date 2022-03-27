import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val que = PriorityQueue<Int>()
    for(i in 0 until n) {
        val input = readLine().toInt()
        if(input == 0) {
            if(que.isEmpty()) println(0)
            else println(que.poll())
        }
        else que.add(input)
    }
}