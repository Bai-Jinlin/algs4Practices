package Chapter1._1

fun histogram(array: Array<Int>, M: Int): Array<Int> {
    val result = Array<Int>(M, { 0 })
    var sum = 0
    for (i in result.indices) {
        for (j in array.indices) {
            if (array[j] == i) ++sum
        }
        result[i] = sum
        sum = 0
    }
    return result
}

fun main(args: Array<String>) {
    histogram(arrayOf(0, 1, 2, 3, 4, 5), 6).forEach{ println(it) }
}