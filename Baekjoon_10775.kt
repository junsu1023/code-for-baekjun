private lateinit var parent: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val gateCnt = readLine().toInt()
    val airplaneCnt = readLine().toInt()

    parent = IntArray(gateCnt + 1) { i -> i }

    var count = 0
    for(i in 0 until airplaneCnt) {
        val temp = readLine().toInt()
        parent[temp] = union(temp)
        val docking = parent[temp]

        if(docking == 0) break

        count++
        parent[docking] = union(parent[docking - 1])
    }

    println(count)
}

private fun union(i: Int): Int {
    if(parent[i] != i) parent[i] = union(parent[i])
    return parent[i]
}