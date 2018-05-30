package Chapter1._1

fun lg(N: Int): Int {
    var divide = N / 2
    var index = 0

    while (divide != 0) {
        ++index
        divide /= 2
    }
    return index
}

fun main(args: Array<String>) {
    val N = StdIn.readInt()

    println(lg(N))
}