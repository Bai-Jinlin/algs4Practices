package Chapter1._1

fun F(N: Int): Array<Int> {
    var n = N
    var f = 0
    var g = 1
    val fibonacci = mutableListOf<Int>()
    while (n != 0) {
        fibonacci.add(f)
        val temp = f
        f += g
        g = temp
        --n
    }
    return fibonacci.toTypedArray()
}

fun main(args: Array<String>) {
    F(6).forEach { println(it) }
}