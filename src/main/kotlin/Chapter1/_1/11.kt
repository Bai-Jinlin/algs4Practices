package Chapter1._1

fun main(args: Array<String>) {
    val matrix = arrayOf(
            arrayOf(true, false, true),
            arrayOf(false, true, false))

    for (i in matrix.first().indices) {
        print(" " + i.toString())
    }
    for (i in matrix.indices) {
        print("\n" + i)
        for (j in matrix.first().indices) {
            print(" " + if(matrix[i][j]) '*' else " ")
        }
    }

}
