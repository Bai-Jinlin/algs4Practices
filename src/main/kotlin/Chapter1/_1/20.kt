package Chapter1._1

import kotlin.math.*

fun foo(m: Int, n: Int): Int {
    if (n == 0) return m
    return foo(m * n, n - 1)
}

fun ln(N: Int): Double {
    val c = foo(1, N)
    return log(c.toDouble(), E)
}

fun foo1(m: Double, n: Int): Double {
    if (n == 0) return m
    return foo1(m + log(n.toDouble(), E), n - 1)
}

fun ln1(N: Int): Double {
    return foo1(0.0, N)
}

fun main(args: Array<String>) {
    println(ln(3))
    println(ln1(3))
}