private lateinit var minCost: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val cityCnt = readLine().toInt()
    val busCnt = readLine().toInt()

    minCost = Array(cityCnt + 1) { IntArray(cityCnt + 1) { 10000000 } }

    for(i in 1 .. cityCnt) minCost[i][i] = 0

    repeat(busCnt) {
        val (start, end, cost) = readLine().split(" ").map { it.toInt() }
        if(minCost[start][end] > cost) minCost[start][end] = cost
    }

    floydWarshall(cityCnt)
}

private fun floydWarshall(n: Int) {
    for(k in 1 .. n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                if(minCost[i][k] + minCost[k][j] < minCost[i][j]) {
                    minCost[i][j] = minCost[i][k] + minCost[k][j]
                }
            }
        }
    }

    for(i in 1 .. n) {
        for(j in 1 .. n) {
            if(minCost[i][j] == 10000000) print("0 ")
            else print("${minCost[i][j]} ")
        }
        println()
    }
}