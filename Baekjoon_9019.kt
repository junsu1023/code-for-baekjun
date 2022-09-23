import java.lang.Math.pow
import java.util.*
import kotlin.math.pow

private lateinit var visited: BooleanArray

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()

    repeat(testCase) {
        visited = BooleanArray(10001)
        val (a, b) = readLine().split(" ").map { it.toInt() }

        val command = bfs(a, b)
        println(command)
    }
}

private fun bfs(start: Int, end: Int): String {
    val que: Queue<Pair<Int, String>> = LinkedList()
    que.add(Pair(start, ""))
    visited[start] = true

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curNum = cur.first
        val curCommand = cur.second

        if(curNum == end) return curCommand

        var commandD = commandD(curNum)
        if(isCheck(commandD)) {
            visited[commandD] = true
            que.add(Pair(commandD, curCommand + "D"))
        }

        val commandS = commandS(curNum)
        if(isCheck(commandS)) {
            visited[commandS] = true
            que.add(Pair(commandS, curCommand + "S"))
        }

        var commandL = commandL(curNum)
        if(isCheck(commandL)) {
            visited[commandL] = true
            que.add(Pair(commandL, curCommand + "L"))
        }

        var commandR = commandR(curNum)
        if(isCheck(commandR)) {
            visited[commandR] = true
            que.add(Pair(commandR, curCommand + "R"))
        }
    }

    return ""
}

private fun commandD(num: Int): Int {
    val n = num * 2 % 10000
    return n
}

private fun commandS(num: Int): Int {
    var n = num - 1
    if(n < 0) n = 9999
    return n
}

private fun commandL(num: Int): Int {
    val n = (num * 10) % 10000 + (num / 1000);
    return n
}

private fun commandR(num: Int): Int {
    val n = (num / 10) + (num % 10) * 1000;
    return n
}

private fun isCheck(num: Int): Boolean = (num in 0 until 10000 && !visited[num])