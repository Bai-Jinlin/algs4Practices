package Chapter1._3

import edu.princeton.cs.algs4.Stack

fun EvaluatePostfix(text: String): Double? {
    val ops = Stack<String>()
    val vals = Stack<Double>()
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
                when (op) {
                    "+" -> vals.push(vals.pop() + va)
                    "-" -> vals.push(vals.pop() - va)
                    "*" -> vals.push(vals.pop() * va)
                    "/" -> vals.push(vals.pop() / va)
                }
            }
            else -> vals.push(it.toDouble())
        }
    }
    return vals.pop()

}

fun main(args: Array<String>) {
    println(EvaluatePostfix("( 1 2 + ) ( ( 3 4 - ) ( 5 6 - ) * ) * )"))
}