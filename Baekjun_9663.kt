import kotlin.math.abs

private lateinit var chess: IntArray
private var count = 0

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    chess = IntArray(n + 1)
    nQueen(0)
    println(count)
}

private fun nQueen(depth: Int) {
    val lastCol = chess.size - 1

    if(promising(depth)) {
        if(depth == lastCol) count++
        else {
            for(j in 1 until lastCol + 1) {
                chess[depth + 1] = j
                nQueen(depth + 1)
            }
        }
    }
}

private fun promising(depth: Int): Boolean {
    var idx = 1
    var check = true

    while(idx < depth && check) {
        if(chess[idx] == chess[depth] || abs(chess[depth] - chess[idx]) == abs(depth - idx)) check = false
        idx++
    }

    return check
}

