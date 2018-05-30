package Chapter1._1

import edu.princeton.cs.algs4.StdIn

fun main(args: Array<String>) {

    val a = StdIn.readInt()
    val b = StdIn.readInt()
    val c = StdIn.readInt()
    if (a == b && b == c) {
        println("equal")
    } else {
        println("not equal")
    }

}