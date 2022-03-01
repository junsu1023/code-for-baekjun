import java.util.*

fun main()  = with(System.`in`.bufferedReader()) {
    val minute = readLine().toInt()
    var stack = Stack<Pair<Int, Int>>()
    var score = 0
    for(i in 0 until minute) {
        val st = StringTokenizer(readLine())
        if(st.nextToken().toInt() == 1) {
            stack.push(Pair(st.nextToken().toInt(), st.nextToken().toInt() - 1))
            if(stack.peek().second == 0) score += stack.pop().first
        }
        else {
            if(stack.empty()) continue
            val first = stack.peek().first
            val second = stack.pop().second - 1
            stack.push(Pair(first, second))
            if(stack.peek().second == 0) score += stack.pop().first
        }
    }
    println(score)
}