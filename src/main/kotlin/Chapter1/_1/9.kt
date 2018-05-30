package Chapter1._1

fun main(args: Array<String>) {

    val n = StdIn.readInt()
    var l = n
    var s = 0
    var binary = ""
    while (l > 0) {
        s = l % 2
        l /= 2
        binary = s.toString() + binary
    }
    println(if (n == 0) "0" else binary)

}
