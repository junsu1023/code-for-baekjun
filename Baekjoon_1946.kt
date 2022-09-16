import java.util.*

private  val pq = PriorityQueue<Info>()

data class Info(val reviewRank: Int, val interviewRank: Int): Comparable<Info> {
    override fun compareTo(other: Info): Int = reviewRank - other.reviewRank
}

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) {
        pq.clear()
        val applicantCnt = readLine().toInt()


        repeat(applicantCnt) {
            val (reviewRank, interviewRank) = readLine().split(" ").map { it.toInt() }
            pq.add(Info(reviewRank, interviewRank))
        }

        val ans = pass(applicantCnt)
        println(ans)
    }
}

private fun pass(n: Int): Int {
    var cnt = 1
    var curStandard = pq.poll().interviewRank
    for(i in 1 until n) {
        val curApplicant = pq.poll()
        val applicantInterviewRank = curApplicant.interviewRank

        if(curStandard > applicantInterviewRank) {
            cnt++
            curStandard = applicantInterviewRank
        }
    }

    return cnt
}