package Chapter1._1

import edu.princeton.cs.algs4.In

fun binarySearch(a: IntArray, key: Int, f: Char): Int {
    var lo = 0;
    var hi = a.size - 1;
    while (lo <= hi) {
        // Key is in a[lo..hi] or not present.
        val mid = lo + (hi - lo) / 2;
        if (key < a[mid]) hi = mid - 1;
        else if (key > a[mid]) lo = mid + 1;
        else {
            if (f == '+')
                println(key)
            return mid
        }
    }
    if (f == '-')
        println(key)
    return -1;
}

fun main(args: Array<String>) {
    val In = In(args[0]);
    val whitelist: IntArray = In.readAllInts();

    whitelist.sort()

    while (!StdIn.isEmpty()) {
        val key = StdIn.readInt();
        binarySearch(whitelist, key, '+')
    }
}