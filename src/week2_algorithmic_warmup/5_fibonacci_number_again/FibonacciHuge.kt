import java.util.*

fun getFibonacciHugeNaive(n: Long, m: Long): Long {
    if (n <= 1) return n

    var previous: Long = 0
    var current: Long = 1

    for (i in 0 until n - 1) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
    }

    return current % m
}

fun getFibonacciLastDigit(n: Long, m: Long): Long {
    if (n <= 1) return n

    var previous: Long = 0
    var current: Long = 1

    for (i in 0 until n - 1) {
        val tmpPrevious = previous
        previous = current
        current += tmpPrevious
        current %= m
    }

    return current
}

fun getPisanoPeriod(m: Long): Long {
    var nMinus1: Long
    var n: Long = 1
    for (i in 2 until m*m+1){
        nMinus1 = n
        n = getFibonacciLastDigit(i,m)
        if (nMinus1.equals(0.toLong()) && n.equals(1.toLong())){
            return i-1
        }
    }
    return 0
}

fun getFibonacciHuge(n: Long, m: Long): Long {
    if (n<= 1) return n
    if (m < 1) return 0

    val pisanoPeriod = getPisanoPeriod(m)

    if (pisanoPeriod > 0) {
        return getFibonacciLastDigit(n % pisanoPeriod, m)
    } else return 0
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val m = scanner.nextLong()
    println(getFibonacciHuge(n, m))
}