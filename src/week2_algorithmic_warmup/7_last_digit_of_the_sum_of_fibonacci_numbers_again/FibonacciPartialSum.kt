import java.util.*

fun getFibonacciPartialSumNaive(from: Long, to: Long): Long {
    var sum: Long = 0

    var current: Long = 0
    var next: Long = 1

    for (i in 0..to) {
        if (i >= from) {
            sum += current
        }

        val newCurrent = next
        next += current
        current = newCurrent % 10
    }

    return sum % 10
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var from = scanner.nextLong()
    var to = scanner.nextLong()
    from %= 60
    to %= 60
    if (to < from) to += 60
    println(getFibonacciPartialSumNaive(from, to))
}