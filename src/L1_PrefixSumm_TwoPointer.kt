import java.util.*

fun main() {
    val a = arrayOf(1, 5, 1, 3, 6, 7)
    val summs = Array(a.size + 1){0}
    for (i in a.indices) {
        summs[i + 1] = summs[i] + a[i]
    }
    println(Arrays.toString(summs))
    println("summ from 2 to 5 = " + (summs[5] - summs[2]))
}