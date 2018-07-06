package Chapter1._3

fun <T> Node<T>.delete(index: Int) {
    var i = index
    var n: Node<T>? = this
    var p: Node<T>? = this
    if (i == 0) {
        if (n?.next == null)
            throw Exception()
        n.item = n.next!!.item
        n.next = n.next!!.next
        return
    }
    while (n?.next != null && i != 0) {
        p = n
        n = n.next
        --i
    }
    if (i != 0) {
        return
    }
    p?.next = n?.next
}

fun main(args: Array<String>) {
    val node = Node(1, Node(2, Node(3, null)))
    node.delete(1)
    println(node)
}