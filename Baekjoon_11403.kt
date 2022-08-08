import java.util.*

private lateinit var check: Array<IntArray>

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    check = Array(n) { IntArray(n) }

    repeat(n) { i ->
        val st = StringTokenizer(readLine())
        repeat(n) { j ->
            check[i][j] = st.nextToken().toInt()
        }
    }

    floydWarshall(n)
}

private fun floydWarshall(n: Int) {
    repeat(n) { k->
        repeat(n) { i ->
            repeat(n) { j ->
                if(check[i][k] + check[k][j] > 1) check[i][j] = 1
            }
        }
    }

    repeat(n) { i ->
        repeat(n) { j ->
            print("${check[i][j]} ")
        }
        println()
    }
}