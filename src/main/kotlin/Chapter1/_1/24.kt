package Chapter1._1

fun Euclid(a: Int, b: Int): Int {
    println("a=$a,b=$b")
    return if (b == 0) a else Euclid(b, a % b)
}

fun main(args: Array<String>) {
    Euclid(1_111_111, 1_234_457)
}