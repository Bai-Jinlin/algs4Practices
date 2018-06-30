package Chapter1._2

import edu.princeton.cs.algs4.Point2D
import edu.princeton.cs.algs4.StdDraw
import edu.princeton.cs.algs4.StdRandom

fun main(args: Array<String>) {
    StdDraw.setPenRadius(0.01)
    val N = 1
    var min: Double = 1.0
    val pointList = mutableListOf<Point2D>()
    for (p in 1..N) {
        pointList.add(Point2D(StdRandom.uniform(), StdRandom.uniform()))
    }
    for (p in pointList) {
        p.draw()
    }
    for (i in 0 until N - 1) {
        for (j in i + 1 until N) {
            val c = pointList[i].distanceTo(pointList[j])
            if (c < min) {
                min = c
            }
        }
    }
    println(min)
}