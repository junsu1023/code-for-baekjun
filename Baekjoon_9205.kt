import java.util.*
import kotlin.math.abs

private var homePos = Pair(0, 0)
private lateinit var storePos: Array<Pair<Int, Int>>
private var festivalPos = Pair(0, 0)
private lateinit var visited: BooleanArray

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()

    repeat(testCase) {
        val storeCnt = readLine().toInt()
        visited = BooleanArray(storeCnt)

        val home = readLine().split(" ").map { it.toInt() }
        homePos = Pair(home[0], home[1])

        storePos = Array(storeCnt) { Pair(0, 0) }
        repeat(storeCnt) { i ->
            val store = readLine().split(" ").map { it.toInt() }
            storePos[i] = Pair(store[0], store[1])
        }

        val festival = readLine().split(" ").map { it.toInt() }
        festivalPos = Pair(festival[0], festival[1])

        val possible = move()

        if(possible) println("happy")
        else println("sad")
    }
}

private fun move(): Boolean {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(homePos)

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curX = cur.first
        val curY = cur.second

        if(manhattan(curX, curY, festivalPos.first, festivalPos.second) <= 1000) return true
        else {
            for(i in storePos.indices) {
                if(manhattan(curX, curY, storePos[i].first, storePos[i].second) <= 1000 && !visited[i]) {
                    visited[i] = true
                    que.add(Pair(storePos[i].first, storePos[i].second))
                }
            }
        }
    }

    return false
}

private fun manhattan(startX: Int, startY: Int, endX: Int, endY: Int): Int
= abs(startX - endX) + abs(startY - endY)