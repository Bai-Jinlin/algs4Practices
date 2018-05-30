fun exR1(a: Int, b: Int): Int {
    if (b == 0) return 0
    if (b % 2 == 0) return exR1(a + a, b / 2)
    return exR1(a + a, b / 2) + a
}


fun main(args: Array<String>) {
    print(exR1(3, 11))
}

