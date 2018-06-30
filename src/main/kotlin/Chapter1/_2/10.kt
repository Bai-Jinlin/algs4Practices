package Chapter1._2

import edu.princeton.cs.algs4.StdDraw

class VisualCounter(val N: Int, val max: Int) {
    private var count = 0
    private var n = 0

    init {
        StdDraw.setXscale(0.0, max.toDouble())
    }

    fun increment() {
        if (n == N) {
            return
        }
        if (count < max) {
            ++count
            StdDraw.point(count.toDouble(), 0.5)
        }
        ++n
    }

    fun reduction() {
        if (n == N) {
            return
        }
        --count
        StdDraw.point(count.toDouble(), 0.5)
        ++n
    }

    fun tally(): Int {
        return N
    }

}

fun main(args: Array<String>) {
    val vc = VisualCounter(10, 100)
    for (t in 1..10) {
        vc.increment()
    }
}