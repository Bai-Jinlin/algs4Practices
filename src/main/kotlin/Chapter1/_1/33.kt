package Chapter1._1

object Matrix {
    fun <T> printMatrix(m: Array<Array<T>>) {
        for (i in m) {
            for (j in i) {
                print("$j ")
            }
            println()
        }
    }

    fun mult(a: Array<Array<Double>>, b: Array<Array<Double>>): Array<Array<Double>> {
        val m = Array(a.size) { Array(b.first().size) { 0.0 } }
        for (i in a.indices) {
            for (j in b.first().indices) {
                for (k in b.indices) {
                    m[i][j] += a[i][k] * b[k][j]
                }
            }

        }
        return m
    }
}


fun main(args: Array<String>) {
    val a = arrayOf(
            arrayOf(1.0, 2.0, 3.0),
            arrayOf(4.0, 5.0, 6.0)
    )
    val b = arrayOf(
            arrayOf(1.0, 2.0),
            arrayOf(3.0, 4.0),
            arrayOf(5.0, 6.0)
    )
    val m = Matrix.mult(a, b)
    Matrix.printMatrix(m)
}