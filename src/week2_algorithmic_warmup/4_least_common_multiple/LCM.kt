import java.lang.Math.abs
import java.util.*

fun lcmNaive(a: Int, b: Int): Long {
    for (l in 1..a.toLong() * b)
        if (l % a == 0L && l % b == 0L)
            return l

    return a.toLong() * b
}

fun lcm(a: Int, b: Int): Long {
    val gcd = gcd(a,b)
    return if (gcd > 0) abs(a.toLong()*b)/gcd(a,b) else 0
}

fun gcd(a: Int, b: Int): Int {
    if (b == 0) return 0
    val rest = a%b;
    return if (rest == 0) b else gcd(b, rest)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    println(lcm(a, b))
}