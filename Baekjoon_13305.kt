import java.util.*

private lateinit var road: LongArray
private lateinit var oilPrice: LongArray

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    road = LongArray(n - 1)
    oilPrice = LongArray(n)

    var st = StringTokenizer(readLine())
    repeat(n - 1) { i ->
        road[i] = st.nextToken().toLong()
    }

    st = StringTokenizer(readLine())
    repeat(n) { i ->
        oilPrice[i] = st.nextToken().toLong()
    }

    totalPrice(n)
}

private fun totalPrice(n: Int) {
    var total = oilPrice[0] * road[0]

    var curOilPrice = oilPrice[0]
    for(i in 1 until n-1) {
        if(oilPrice[i] < curOilPrice) {
            curOilPrice = oilPrice[i]
        }
        total += curOilPrice * road[i]
    }

    println(total)
}