import java.util.*

fun main()  = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val energyDrink = IntArray(n)
    val st = StringTokenizer(readLine())
    repeat(n) { i -> energyDrink[i] = st.nextToken().toInt() }
    energyDrink.sort()
    var totalEnergyDrink = energyDrink[n-1].toDouble()
    repeat(n-1) { i ->
        totalEnergyDrink += energyDrink[i] / 2.0
    }
    println(totalEnergyDrink)
}