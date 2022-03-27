import java.lang.StringBuilder
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    while(true) {
        val sb = StringBuilder()
        val st = StringTokenizer(readLine())

        val n = st.nextToken().toInt()
        if(n == 0) break
        val arr = IntArray(n)

        for(i in 0 until n) arr[i] = st.nextToken().toInt()
        arr.sort()

        val saveNum = IntArray(6)
        val visited = BooleanArray(n)

        fun dfs(idx: Int, start: Int) {
            if(idx == 6) {
                saveNum.forEach { i -> sb.append("$i ") }
                sb.append("\n")
                return
            }
            for(i in start until n) {
                if(!visited[i]) {
                    visited[i] = true
                    saveNum[idx] = arr[i]
                    dfs(idx+1, i)
                    visited[i] = false
                }
            }
        }
        dfs(0, 0)
        println(sb.toString())
    }
}