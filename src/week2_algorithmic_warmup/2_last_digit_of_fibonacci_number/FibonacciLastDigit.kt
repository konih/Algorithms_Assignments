import java.util.*

fun getFibonacciLastDigitNaive(n: Int): Int {
    if (n <= 1)
        return n

    var previous = 0
    var current = 1

    for (i in 0 until n - 1) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
        current %= 10
    }

    return current % 10
}

fun getFibonacciLastDigit(n: Int): Int {
    var nshort = n % 60
    if (nshort <= 1)
        return nshort
    var previous = 0
    var current = 1

    for (i in 0 until nshort - 1) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
        current %= 10
    }

    return current
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    val c = getFibonacciLastDigit(n)
    println(c)
}