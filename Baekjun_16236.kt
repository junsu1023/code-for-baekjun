import java.util.*
import kotlin.collections.ArrayList

private var n = 0
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private val que: Queue<Pos> = LinkedList()
private lateinit var arr: Array<IntArray>

data class Pos(val y: Int, val x: Int, val dist: Int)

fun main() = with(System.`in`.bufferedReader()) {
    n = readLine().toInt()

    arr = Array(n) { IntArray(n) }

    repeat(n) { i ->
        val st = StringTokenizer(readLine())
        repeat(n) { j ->
            arr[i][j] = st.nextToken().toInt()
            if(arr[i][j] == 9) {
                que.add(Pos(i, j, 0))
                arr[i][j] = 0
            }
        }
    }

    println(bfs())
}

private fun bfs(): Int {
    var time = 0
    var eat = 0
    var sharkSize = 2

    while(true) {
        val fish = ArrayList<Pos>()
        val dist = Array(n) { IntArray(n) }

        while(que.isNotEmpty()) {
            val cur = que.poll()
            val curY = cur.y
            val curX = cur.x

            for(i in 0 until 4) {
                val nextY = curY + dy[i]
                val nextX = curX + dx[i]

                if(checkCondition(nextY, nextX, sharkSize, dist)) {
                    dist[nextY][nextX] = dist[curY][curX] + 1
                    que.add(Pos(nextY, nextX, dist[nextY][nextX]))

                    if(canEat(nextY, nextX, sharkSize)) fish.add(Pos(nextY, nextX, dist[nextY][nextX]))
                }
            }
        }

        if(fish.isEmpty()) return time

        var curFish = fish[0]
        for(i in 1 until fish.size) {
            if(curFish.dist > fish[i].dist) {
                curFish = fish[i]
            }
            else if(curFish.dist == fish[i].dist) {
                if(curFish.y > fish[i].y) {
                    curFish = fish[i]
                }
                else if(curFish.y == fish[i].y) {
                    if(curFish.x > fish[i].x) {
                        curFish = fish[i]
                    }
                }
            }
        }

        time += curFish.dist
        eat++
        arr[curFish.y][curFish.x] = 0

        if(eat == sharkSize) {
            sharkSize++
            eat = 0
        }

        que.add(Pos(curFish.y, curFish.x, 0))
    }
}

private fun canEat(y: Int, x: Int, sharkSize: Int): Boolean {
    if(arr[y][x] in 1 .. 6 && sharkSize > arr[y][x]) return true
    return false
}

private fun checkCondition(y: Int, x: Int, sharkSize: Int, dist: Array<IntArray>): Boolean {
    if(y in 0 until n && x in 0 until n && sharkSize >= arr[y][x] && dist[y][x] == 0) return true
    return false
}