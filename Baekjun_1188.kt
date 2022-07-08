fun main() = with(System.`in`.bufferedReader()) {
    val (sausage, critic) = readLine().split(" ").map { it.toInt() }
    println(critic - gcd(sausage, critic))
}

fun gcd(a: Int, b: Int): Int {
    if(a % b == 0) return b
    return gcd(b, a % b)
}