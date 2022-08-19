data class Score(val name: String, val korean: Int, val english: Int, val math: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()

    val list = List(n) {
        val (name, korean, english, math) = readLine().split(" ").map { it }
        Score(name, korean.toInt(), english.toInt(), math.toInt())
    }

    val sort = list.sortedWith(kotlin.Comparator { o1, o2 ->
        if(o1.korean == o2.korean) {
            if(o1.english == o2.english) {
                if(o1.math == o2.math) {
                    o1.name.compareTo(o2.name)
                }
                else o2.math.compareTo(o1.math)
            }
            else o1.english.compareTo(o2.english)
        }
        else o2.korean.compareTo(o1.korean)
    })

    sort.forEach { println(it.name) }
}