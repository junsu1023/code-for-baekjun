private lateinit var visited: BooleanArray
private lateinit var arr: IntArray
private var cnt = 0

fun main() = with(System.`in`.bufferedReader()) {
    repeat(readLine().toInt()) {
        cnt = 0
        val n = readLine().toInt()

        val input = readLine().split(" ").map { it.toInt() - 1 }
        arr = IntArray(n) {  input[it] }
        visited = BooleanArray(n)


        arr.forEachIndexed { index, i ->
            if(!visited[index]) {
                cnt++
                checkLink(i)
            }
        }

        println(cnt)
    }
}

private fun checkLink(curNode: Int) {
    visited[curNode] = true
    val nextNode = arr[curNode]

    if(!visited[nextNode!!]) checkLink(nextNode)
}