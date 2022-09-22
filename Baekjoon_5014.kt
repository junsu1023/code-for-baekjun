import java.util.*

private lateinit var visited: BooleanArray

data class MoveInfo(val floor: Int, val cnt: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val totalFloor = st.nextToken().toInt()
    val curFloor = st.nextToken().toInt()
    val startLinkFloor = st.nextToken().toInt()
    val up = st.nextToken().toInt()
    val down = st.nextToken().toInt()

    visited = BooleanArray(totalFloor + 1)
    val move = bfs(totalFloor, curFloor, startLinkFloor, up, down)

    if(move == -1) println("use the stairs")
    else println(move)
}

private fun bfs(totalFloor: Int, floor: Int, startLinkFloor: Int, up: Int, down: Int): Int {
    val que: Queue<MoveInfo> = LinkedList()
    que.add(MoveInfo(floor, 0))
    visited[floor] = true

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curFloor = cur.floor
        val curMoveCnt = cur.cnt

        if(curFloor == startLinkFloor) return curMoveCnt

        val upFloor = curFloor + up
        val downFloor = curFloor - down

        if(isCheck(upFloor, totalFloor)) {
            visited[upFloor] = true
            que.add(MoveInfo(upFloor, curMoveCnt + 1))
        }

        if(isCheck(downFloor, totalFloor)) {
            visited[downFloor] = true
            que.add(MoveInfo(downFloor, curMoveCnt + 1))
        }
    }

    return -1
}

private fun isCheck(floor: Int, totalFloor: Int): Boolean = (floor in 1 .. totalFloor && !visited[floor])