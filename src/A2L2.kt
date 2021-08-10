import java.io.File

fun main() {
    val map = mutableMapOf<String, Int>()
    val sb = StringBuilder()
    File("input.txt").forEachLine {
        val its = it.trim()
        if (!its.isEmpty()) {
            val sss = its.split(Regex("\\s+"))
            for (s in sss) {
                var cnt = map[s]
                if (cnt == null)
                    cnt = 0
                sb.append("$cnt ")
                map[s] = ++cnt
            }
        }
    }
    println(sb.toString())
}