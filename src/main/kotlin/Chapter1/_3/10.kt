package Chapter1._3

import edu.princeton.cs.algs4.Stack

fun InfixToPostfix(text: String): String {
    val ops = Stack<String>()
    val vals = Stack<String>()
    text.split("\\s+".toRegex()).forEach {
        when (it) {
            "(" -> {
            }
            "+", "-", "*", "/" -> {
                ops.push(it)
            }
            ")" -> {
                val op = ops.pop()
                val va = vals.pop()
                vals.push("( ${vals.pop()} $va $op )")
            }
            else -> vals.push(it)
        }
    }
    return vals.pop()

}

fun main(args: Array<String>) {
    println(InfixToPostfix("( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )"))
}