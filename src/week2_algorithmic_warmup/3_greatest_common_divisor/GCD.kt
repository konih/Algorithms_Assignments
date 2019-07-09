import java.util.*

fun gcdNaive(a: Int, b: Int): Int {
    var currentGcd = 1
    var d = 2
    while (d <= a && d <= b) {
        if (a % d == 0 && b % d == 0) {
            if (d > currentGcd) {
                currentGcd = d
            }
        }
        ++d
    }

    return currentGcd
}
fun gcd(a: Int, b: Int): Int {
    val rest = a%b;
    return if (rest == 0) b else return gcd(b, rest)
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    println(gcd(a, b))
}