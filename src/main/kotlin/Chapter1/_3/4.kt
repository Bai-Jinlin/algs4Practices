package Chapter1._3

import edu.princeton.cs.algs4.Stack

fun parentheses(): Boolean {
    fun leftParenthese(c: Char) =
            when (c) {
                ')' -> '('
                ']' -> '['
                '}' -> '{'
                else -> ' '
            }

    val text = readLine()
    val stack: Stack<Char> = Stack()
    for (i in text!!.indices) {
        when (text[i]) {
            ')', ']', '}' -> {
                when {
                    stack.isEmpty -> stack.push(text[i])
                    stack.peek() == leftParenthese(text[i]) -> stack.pop()
                    else -> stack.push(text[i])
                }
            }
            else -> stack.push(text[i])
        }
    }
    return stack.isEmpty
}

fun main(args: Array<String>) {
    println(parentheses())
}