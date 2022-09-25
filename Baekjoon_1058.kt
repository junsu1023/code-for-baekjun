import kotlin.math.max
import kotlin.math.min

private lateinit var arr: Array<IntArray>
private const val INF = 987654321

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    arr = Array(n) { IntArray(n) }

    repeat(n) { i ->
        repeat(n) { j ->
            if(i == j) arr[i][j] = 0
            else arr[i][j] = INF
        }
    }

    repeat(n) { i ->
        val stat = readLine().toCharArray()
         repeat(n) { j ->
             if(stat[j] == 'Y') arr[i][j] = 1
         }
    }

    floyd(n)

    var max = 0
    for(i in 0 until n) {
        var cnt = 0
        for(j in 0 until n) {
            if(i == j) continue
            if(arr[i][j] <= 2) cnt++
        }

        max = max(cnt, max)
    }

    println(max)
}

private fun floyd(n: Int) {
    for(k in 0 until n) {
        for(i in 0 until n) {
            for(j in 0 until n) {
                if(i == j || i == k || j == k) continue
                arr[i][j] = min(arr[i][j], arr[i][k] + arr[k][j])
            }
        }
    }
}