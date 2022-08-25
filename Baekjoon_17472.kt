import java.util.*

data class BridgeInfo(val from: Int, val to: Int, val len: Int): Comparable<BridgeInfo> {
    override fun compareTo(other: BridgeInfo): Int = len - other.len
}

private lateinit var map: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private lateinit var parent: IntArray
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private val pq = PriorityQueue<BridgeInfo>()
private var row = 0
private var col = 0

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    row = st.nextToken().toInt()
    col = st.nextToken().toInt()

    map = Array(row) { IntArray(col) }
    visited = Array(row) { BooleanArray(col) }

    repeat(row) { i ->
        st = StringTokenizer(readLine())
        repeat(col) { j ->
            map[i][j] = st.nextToken().toInt()

            if(map[i][j] == 1) map[i][j] = -1
        }
    }

    var number = 1
    for(i in 0 until row) {
        for(j in 0 until col) {
            if(map[i][j] == -1 && !visited[i][j]) {
                islandIndexing(i, j, number)
                number++
            }
        }
    }

    for(i in 0 until row) {
        for(j in 0 until col) {
            if(map[i][j] != 0) {
                makeBridge(i, j, map[i][j])
            }
        }
    }


    val ans = kruskal(number)

    if(ans == 0) println(-1)
    else println(ans)
}

private fun islandIndexing(y: Int, x: Int, number: Int) {
    val que: Queue<Pair<Int, Int>> = LinkedList()
    que.add(Pair(y, x))
    map[y][x] = number
    visited[y][x] = true

    while(que.isNotEmpty()) {
        val cur = que.poll()
        val curY = cur.first
        val curX = cur.second

       repeat(4) { i ->
            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(isRange(nextY, nextX) && !visited[nextY][nextX] && map[nextY][nextX] == -1) {
                map[nextY][nextX] = number
                visited[nextY][nextX] = true
                que.add(Pair(nextY, nextX))
            }
        }
    }
}

private fun makeBridge(y: Int, x: Int, start: Int) {
    repeat(row) { i -> visited[i].fill(false) }

    val que: Queue<Triple<Int, Int, Int>> = LinkedList()
    for(i in 0 until 4) {
        que.add(Triple(y, x, 0))
        visited[y][x] = true

        while(que.isNotEmpty()) {
            val cur = que.poll()
            val curY = cur.first
            val curX = cur.second
            val len = cur.third

            val nextY = curY + dy[i]
            val nextX = curX + dx[i]

            if(isRange(nextY, nextX) && !visited[nextY][nextX]) {
                if(map[nextY][nextX] != start) {
                    if(map[nextY][nextX] == 0) {
                        que.add(Triple(nextY, nextX, len + 1))
                        visited[nextY][nextX] = true
                    }
                    else {
                        val arrive = map[nextY][nextX]

                        if(len > 1) {
                            pq.add(BridgeInfo(start, arrive, len))
                            break
                        }
                    }
                }
            }
        }
        que.clear()
    }
}

private fun kruskal(number: Int): Int {
    parent = IntArray(number) { i -> i }
    var totalLength = 0

    while(pq.isNotEmpty()) {
        val cur = pq.poll()
        val from = cur.from
        val to = cur.to
        val len = cur.len

        if(find(from) != find(to)) {
            union(from, to)
            totalLength += len
        }
    }

    var allConnect = true
    for(i in 2 until number) {
        if(find(parent[i]) != 1) allConnect = false
    }

    return if(allConnect) totalLength
    else 0
}

private fun union(a: Int, b: Int) {
    val aRoot = find(a)
    val bRoot = find(b)

    if(aRoot < bRoot) parent[bRoot] = aRoot
    else parent[aRoot] = bRoot
}

private fun find(island: Int): Int {
    if(parent[island] != island) return find(parent[island])
    return parent[island]
}

private fun isRange(y: Int, x: Int): Boolean = (y in 0 until row && x in 0 until col)