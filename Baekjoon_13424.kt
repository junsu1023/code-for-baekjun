import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

private lateinit var map: Array<IntArray>
private const val INF = 987654321

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    repeat(testCase) { i ->
        val (roomCnt, secretPassageCnt) = readLine().split(" ").map { it.toInt() }

        map = Array(roomCnt + 1) { IntArray(roomCnt + 1) }
        for(i in 1 .. roomCnt) {
            for(j in 1 .. roomCnt) {
                if(i == j) map[i][j] = 0
                else map[i][j] = INF
            }
        }

        repeat(secretPassageCnt) {
            val (from, to, cost) = readLine().split(" ").map { it.toInt() }
            map[from][to] = cost
            map[to][from] = cost
        }

        val friendCnt = readLine().toInt()

        val locateFriendRoom = ArrayList<Int>()
        val st = StringTokenizer(readLine())
        repeat(friendCnt) {
            locateFriendRoom.add(st.nextToken().toInt())
        }


        floyd(roomCnt)

        var ans = 0
        var move = Integer.MAX_VALUE
        for(i in 1 .. roomCnt) {
            var temp = 0
            for(j in locateFriendRoom) {
                if(i == j) continue
                temp += map[j][i]
            }

            if(move > temp) {
                move = temp
                ans = i
            }
        }

        println(ans)
    }
}

private fun floyd(n: Int) {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                map[i][j] = min(map[i][j], map[i][k] + map[k][j])
            }
        }
    }
}