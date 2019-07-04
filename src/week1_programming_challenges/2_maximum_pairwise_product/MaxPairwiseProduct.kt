import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.*

fun getMaxPairwiseProduct(numbers: IntArray): Long {
    var biggest = 0
    var second_biggest = 0
    for (number in numbers) {
        if (number > second_biggest) {
            if (number > biggest) {
                second_biggest = biggest
                biggest = number
            } else {
                second_biggest = number
            }
        }
    }
    return biggest.toLong()* second_biggest.toLong()
}

fun main(args: Array<String>) {
    val scanner = FastScanner(System.`in`)
    val n = scanner.nextInt()
    val numbers = IntArray(n)
    for (i in 0 until n) {
        numbers[i] = scanner.nextInt()
    }
    println(getMaxPairwiseProduct(numbers))
}

class FastScanner(stream: InputStream) {
    var br: BufferedReader = BufferedReader(InputStreamReader(stream))
    var st: StringTokenizer? = null

    fun next(): String {
        while (st == null || !st!!.hasMoreTokens()) {
            try {
                st = StringTokenizer(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return st!!.nextToken()
    }

    fun nextInt() = next().toInt()
}