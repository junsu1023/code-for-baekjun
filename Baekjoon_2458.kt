private lateinit var cmp: Array<BooleanArray>

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    cmp = Array(n + 1) { BooleanArray(n + 1) }

    repeat(m) {
        val (s1, s2) = readLine().split(" ").map { it.toInt() }
        cmp[s1][s2] = true
    }

    floydWarshall(n)

    var ans = 0
    for(i in 1 .. n) {
        var cnt = 0
        for(j in 1 .. n) {
            if(cmp[i][j] || cmp[j][i]) cnt++
        }
        if(cnt == n - 1) ans++
    }
    println(ans)
}

private fun floydWarshall(n: Int) {
    for(k in 1 ..  n) {
        for(i in 1 .. n) {
            for(j in 1 .. n) {
                if(cmp[i][k] && cmp[k][j]) {
                    cmp[i][j] = true
                }
            }
        }
    }
}