package Chapter1._3

class Node<T>(var item: T) {
    constructor(item: T, next: Node<T>?) : this(item) {
        this.next = next
    }

    var next: Node<T>? = null

    val length: Int
        get() {
            var count = 0
            var n: Node<T>? = this
            while (n != null) {
                ++count
                n = n.next
            }
            return count
        }

    override fun toString(): String {
        var n: Node<T>? = this
        if (n?.next == null) {
            return "[${n?.toString()}]"
        }
        val s = StringBuffer("[")
        while (n?.next != null) {
            s.append("${n?.item},")
            n = n?.next
        }
        s.append("${n?.item}]")
        return s.toString()
    }

}


fun main(args: Array<String>) {
    val first = Node(1, Node(2, Node(3, null)))
    var t = first
    while (t.next?.next != null) {
        t = t.next!!
    }
    t.next = null
    println(first)
}