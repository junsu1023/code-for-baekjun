import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val testCase = readLine().toInt()
    var st: StringTokenizer
    repeat(testCase) {
        val n = readLine().toInt()
        val map = TreeMap<Int, Int>()

        for(i in 0 until n) {
            st = StringTokenizer(readLine())
            val commend = st.nextToken()
            val num = st.nextToken().toInt()

            when(commend) {
                "I" -> map[num] = map.getOrDefault(num, 0) + 1
                else -> {
                    if(map.isEmpty()) continue
                    val removeIdx = if(num == 1) map.lastKey() else map.firstKey()
                    if(map.put(removeIdx, map[removeIdx]!! - 1) == 1) map.remove(removeIdx)
                }
            }
        }
        if(map.isEmpty()) println("EMPTY")
        else println("${map.lastKey()} ${map.firstKey()}")
    }
}