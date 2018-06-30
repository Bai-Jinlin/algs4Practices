package Chapter1._2

class SmartData(val month: Int,
                val day: Int,
                val year: Int) {

    init {
        if (month > 12) {
        }
    }

    val dayOfMonth = arrayListOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    fun month(): Int {
        return month
    }

    fun day(): Int {
        return day
    }

    fun year(): Int {
        return year
    }

    override fun toString(): String {
        return "${month()}/${day()}/${year()}"
    }
}

fun main(args: Array<String>) {
}
