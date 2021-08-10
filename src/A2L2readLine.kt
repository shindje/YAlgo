import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    var s = input.nextLine()
    while (System.`in`.available() > 0) {
        println(s)
        val s = input.nextLine()
        if (System.`in`.available() > 0)
        println(s)
    }
}