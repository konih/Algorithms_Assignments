import java.util.*

fun calcFibSlow(n: Long): Long {
    return if (n <= 1) n else calcFibSlow(n - 1) + calcFibSlow(n - 2)
}
fun calcFib(n: Long): Long {
    if (n <= 1){
        return n
    }
    var nMinus1:Long = 0
    var nMinus2:Long = 1
    var current:Long = 0
    for (i in 1..n){
        current = nMinus1 + nMinus2
        nMinus2 = nMinus1;
        nMinus1 = current;
    }
    return current;
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    println(calcFib(n))
}