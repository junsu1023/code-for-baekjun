import java.util.*

private lateinit var arr: Array<Array<IntArray>>
private lateinit var visited: Array<Array<BooleanArray>>
private val que: Queue<Tomato> = LinkedList()
private val dx = intArrayOf(1, -1, 0, 0, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1, 0, 0)
private val dz = intArrayOf(0, 0, 0, 0, 1, -1)
private var row = 0
private var col = 0
private var height = 0

data class Tomato(val y: Int, val x: Int, val z: Int)

fun main() = with(System.`in`.bufferedReader()) {
    input()
    tomatoCheck()
}

private fun input() {
    var st = StringTokenizer(readLine())
    col = st.nextToken().toInt()
    row = st.nextToken().toInt()
    height = st.nextToken().toInt()

    arr = Array(row) { Array(col) { IntArray(height) } }
    visited = Array(row) { Array(col) { BooleanArray(height) } }

    repeat(height) { k ->
        repeat(row) { i ->
            st = StringTokenizer(readLine())
            repeat(col) { j ->
                arr[i][j][k] = st.nextToken().toInt()
                if(arr[i][j][k] == 1) que.add(Tomato(i, j, k))
            }
        }
    }
}

private fun tomatoCheck() {
    while(que.isNotEmpty()) {
        val curY = que.peek().y
        val curX = que.peek().x
        val curZ = que.peek().z
        que.poll()

        for (i in 0 until 6) {
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]
            val nextZ = curZ + dz[i]

            if (!rangeCheck(nextY, nextX, nextZ)) continue
            if (arr[nextY][nextX][nextZ] == 0) {
                arr[nextY][nextX][nextZ] = arr[curY][curX][curZ] + 1
                que.add(Tomato(nextY, nextX, nextZ))
            }
        }
    }

    when (val day = stateCheck()) {
        -1 -> println(-1)
        1 -> println(0)
        else -> println(day)
    }
}

private fun rangeCheck(y: Int, x: Int, z: Int): Boolean {
    if(y in 0 until row && x in 0 until col && z in 0 until height) return true
    return false
}

private fun stateCheck(): Int {
    var max = Integer.MIN_VALUE
    repeat(row) { i ->
        repeat(col) { j ->
            repeat(height) { k ->
                if(arr[i][j][k] == 0) return -1
                max = maxOf(max, arr[i][j][k])
            }
        }
    }

    return max - 1
}