package Chapter1._1

import edu.princeton.cs.algs4.StdRandom


fun delEle(arr: MutableList<Int>) {
    var i = 0
    while (i < arr.size) {
        val ele = arr[i]
        var j = i + 1
        while (j < arr.size) {
            if (ele == arr[j]) {
                arr.removeAt(j)
            } else {
                ++j
            }
        }
        ++i
    }
}

fun main(args: Array<String>) {
    val arr = MutableList(100) { StdRandom.uniform(5) }
    arr.forEach { print("$it,") }; println()
    delEle(arr)
    arr.forEach { print("$it,") }; println()
}
