package Chapter1._1

fun main(args: Array<String>) {
    val x: Double = StdIn.readDouble()
    val y: Double = StdIn.readDouble()
    if ((0.0 < x && x < 1.0) && (0.0 < y && y < 1.0)) {
        println("true")
    } else {
        println("false")
    }
}

