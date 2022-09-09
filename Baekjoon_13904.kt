import java.util.*
import kotlin.math.max

private val pq = PriorityQueue<Info>()
private var maxDeadLine = 0

data class Info(val deadLine: Int, val score: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = score - other.score
}

fun main() {
    input()
    println(totalScore())
}

private fun totalScore(): Int {
    val getScore = IntArray(maxDeadLine + 1)

    while(pq.isNotEmpty()) {
        val curProblem = pq.poll()
        val curProblemDeadLine = curProblem.deadLine
        val curProblemScore = curProblem.score

        for(i in curProblemDeadLine downTo 1) {
            if(getScore[i] < curProblemScore) {
                getScore[i] = curProblemScore
                break
            }
        }
    }

    var total = 0
    for(i in 1 .. maxDeadLine) {
        total += getScore[i]
    }

    return total
}

private fun input() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    repeat(n) {
        val (deadLine, score) = readLine().split(" ").map { it.toInt() }
        maxDeadLine = max(maxDeadLine, deadLine)
        pq.add(Info(deadLine, score))
    }
}