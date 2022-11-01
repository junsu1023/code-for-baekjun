fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val weight = readLine().split(" ").map { it.toInt() }.sorted()
    println(solve(weight))
}

fun solve(weight: List<Int>): Int {
    var sum = 1

    run {
        weight.forEach {
            if(sum < it) return@run
            sum += it
        }
    }

    return sum
}