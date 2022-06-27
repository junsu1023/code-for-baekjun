import kotlin.math.min

lateinit var chess: Array<CharArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (row, col) = readLine().split(" ").map { it.toInt() }

    chess = Array(row) { CharArray(col) }

    repeat(row) { i ->
        val str = readLine().toCharArray()
        repeat(col) { j ->
            chess[i][j] = str[j]
        }
    }

    var ans = Integer.MAX_VALUE

    for(i in 0 until row - 7) {
        for(j in 0 until col - 7) {
            var cntB = 0
            var cntW = 0
            for(a in i until i + 8) {
                for(b in j until j + 8) {
                    if((a + b) % 2 == 0) {
                        if(chess[a][b] == 'B') cntW++
                        else cntB++
                    }
                    else {
                        if(chess[a][b] == 'B') cntB++
                        else cntW++
                    }
                }
            }
            ans = min(ans, cntB)
            ans = min(ans, cntW)
        }
    }

    println(ans)
}