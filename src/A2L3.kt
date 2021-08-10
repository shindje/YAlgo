import java.io.File
import java.util.*

fun main() {
    var best = 0
    var bests = sortedSetOf<String>()
    val all = mutableMapOf<String, Int>()
    File("input.txt").forEachLine {
        val its = it.trim()
        if (!its.isEmpty()) {
            val sss = its.split(Regex("\\s+"))
            for (s in sss) {
                var sAll = all[s]
                if (sAll == null)
                    sAll = 0
                var newSAll = sAll!!
                newSAll++
                all[s] = newSAll

                if (newSAll == best)
                    bests.add(s)
                else if (newSAll > best) {
                    bests = sortedSetOf(s)
                    best = newSAll
                }
            }
        }
    }
    print(bests.first())
}