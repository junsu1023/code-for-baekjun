import java.util.*

fun main()  = with(System.`in`.bufferedReader()) {
    val m = readLine().toInt()
    val colorRock = IntArray(m)
    val percentage = DoubleArray(m)
    val st = StringTokenizer(readLine())
    var totalRock = 0
    repeat(m) { i ->
        colorRock[i] = st.nextToken().toInt()
        totalRock += colorRock[i]
    }
    val k = readLine().toInt()

    for(i in 0 until m) {
        if(colorRock[i] < k) continue
        var savePercentage = 1.0
        for(j in 0 until k) {
            savePercentage *= (colorRock[i] - j).toDouble() / (totalRock - j).toDouble()
        }
        percentage[i] = savePercentage
    }
    var ans = 0.0
    repeat(m) { i -> ans += percentage[i] }
    println(ans)
}