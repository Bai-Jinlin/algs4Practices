package Chapter1._1

fun rank_29(key: Int, a: Array<Int>): Int {
    var c = 0
    a.forEach { if (it < key) ++c }
    return c
}

fun count_29(key: Int, a: Array<Int>): Int {
    var c = 0
    a.forEach { if (it == key) ++c }
    return c
}

fun main(args: Array<String>) {
    println(rank_29(3, arrayOf(1, 2, 3)))
    println(count_29(3, arrayOf(1, 2, 3)))
}