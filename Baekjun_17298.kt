import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n)
    val stack = Stack<Int>()
    val st = StringTokenizer(readLine())
    repeat(n) { i -> arr[i] = st.nextToken().toInt() }

    repeat(n) { i ->
        while(stack.isNotEmpty() && arr[stack.peek()] < arr[i]) arr[stack.pop()] = arr[i]
        stack.push(i)
    }

    while(stack.isNotEmpty()) arr[stack.pop()] = -1

    val sb = StringBuilder()
    repeat(n) { i -> sb.append(arr[i]).append(" ") }

    println(sb.toString())
}