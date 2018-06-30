package Chapter1._1

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main(args: Array<String>) {

    val N = 3
    val matrix = Array(N) { Array(N) { true } }
    for (i in matrix.indices) {
        for (j in matrix.first().indices) {
            if (gcd(i, j) != 1) matrix[i][j] = false
        }
    }
    Matrix.printMatrix(matrix)

}
