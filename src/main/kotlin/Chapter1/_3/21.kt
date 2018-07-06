package Chapter1._3

fun <T> Node<T>.find(key: T): Boolean {
    var n: Node<T>? = this
    while (n !== null) {
        if (n.item == key)
            return true
        n = n.next
    }
    return false
}