package Chapter1._1

import edu.princeton.cs.algs4.StdIn
import edu.princeton.cs.algs4.StdOut

fun main(args: Array<String>) {
    val nameList = mutableListOf<String?>()
    val n1List = mutableListOf<Int>()
    val n2List = mutableListOf<Int>()
    while (!StdIn.isEmpty()) {
        nameList.add(StdIn.readString())
        n1List.add(StdIn.readInt())
        n2List.add(StdIn.readInt())
    }
    for (i in nameList.indices) {
        StdOut.printf("Name is %s, Number1 is %d , Number2 is %d , n1/n2 = %.3f\n",
                nameList[i], n1List[i], n2List[i], n1List[i].toDouble() / n2List[i].toDouble())
    }
}