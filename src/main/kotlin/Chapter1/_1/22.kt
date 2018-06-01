package Chapter1._1

fun rank(key: Int, a: Array<Int>) = rank(key, a, 0, a.size - 1, 0)

fun rank(key: Int, a: Array<Int>, lo: Int, hi: Int, deep: Int): Int {
    val mid = lo + (hi - lo) / 2
    repeat(deep) { print("\t") }
    println("lo=$lo,hi=$hi,mid=$mid")
    if (lo > hi) return -1
    if (key < a[mid]) return rank(key, a, lo, mid - 1, deep + 1)
    else if (key > a[mid]) return rank(key, a, mid + 1, hi, deep + 1)
    else return mid
}

fun main(args: Array<String>) {
    val a = Array<Int>(10, { it * 2 })
    a.map { print("$it ") }
    println()
    println(rank(4, a))
}