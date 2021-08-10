import java.io.File

fun main() {
    val map = mutableMapOf<String, Int>()
    File("input.txt").useLines { lines -> lines.forEach {
        if (!it.isEmpty()) {
            val sss = it.split(" ")
            for (s in sss) {
                var cnt = map[s]
                if (cnt == null)
                    cnt = 0
                print("$cnt ")
                map[s] = ++cnt
            }
        }
    }}
}