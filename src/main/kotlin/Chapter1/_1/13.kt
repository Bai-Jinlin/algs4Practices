package Chapter1._1


fun main(args: Array<String>) {
    val matrix = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6))
    val matrixTranspose = Array<Array<Int>>(matrix.first().size, { Array(matrix.size, { 0 }) })

    for (i in matrix.indices) {
        for (j in matrix.first().indices) {
            matrixTranspose[j][i] = matrix[i][j]
        }
    }

    for (i in matrixTranspose.first().indices) {
        print(" " + i.toString())
    }
    for (i in matrixTranspose.indices) {
        print("\n" + i)
        for (j in matrixTranspose.first().indices) {
            print(" " + matrixTranspose[i][j])
        }
    }

}