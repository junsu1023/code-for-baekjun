import java.util.*
import kotlin.math.max

private lateinit var dp: Array<IntArray>
private val sb = StringBuilder()

fun main() = with(System.`in`.bufferedReader()) {
    val str1 = readLine().toCharArray()
    val str2 = readLine().toCharArray()

    val len1 = str1.size
    val len2 = str2.size
    dp = Array(len1 + 1) { IntArray(len2 + 1) }

    lcs(str1, str2)
    printString(str1, len1, len2)

    println(sb.toString())
}

private fun lcs(str1: CharArray, str2: CharArray) {
    for(i in 1 .. str1.size) {
        for(j in 1 .. str2.size) {
            if(str1[i-1] == str2[j-1]) dp[i][j] = dp[i-1][j-1] + 1
            else dp[i][j] = max(dp[i-1][j], dp[i][j-1])
        }
    }

    sb.append("${dp[str1.size][str2.size]}\n")
}

private fun printString(str: CharArray, len1: Int, len2: Int) {
    val stack = Stack<Char>()
    var i = len1
    var j = len2

    while(dp[i][j] != 0) {
        if(dp[i][j] == dp[i][j-1]) j--
        else if(dp[i][j] == dp[i-1][j]) i--
        else if(dp[i][j] - 1 == dp[i-1][j-1]) {
            stack.push(str[i-1])
            i--
            j--
        }
    }

    while(stack.isNotEmpty()) {
        sb.append(stack.pop())
    }
}