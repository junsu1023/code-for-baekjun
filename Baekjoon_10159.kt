private lateinit var map: Array<BooleanArray>

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val pairCnt = readLine().toInt()
    map = Array(n + 1) { BooleanArray(n + 1) }

    repeat(pairCnt) {
        val (from, to) = readLine().split(" ").map { it.toInt() }
        map[from][to] = true
    }

    floyd(n)

    val sb = StringBuilder()
    for(i in 1 .. n) {
        var cnt = 0
        for(j in 1 .. n) {
            if(i == j) continue
            if(!map[i][j] && !map[j][i]) cnt++
        }
        sb.append("${cnt}\n")
    }

    println(sb.toString())
}

private fun floyd(n: Int) {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                if(map[i][k] && map[k][j]) map[i][j] = true
            }
        }
    }
}