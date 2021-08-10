fun main() {
    val N = Integer.parseInt(readLine())
    val max = Array<Int>(N) {0}
    val res = Array<String>(N) {"NO"}
    var ss = readLine()!!.split(" ")
    for (i in 0 until N) {
        max[i] = Integer.parseInt(ss[i])
    }
    val map = mutableMapOf<Int, Int>()
    val K = Integer.parseInt(readLine())
    ss = readLine()!!.split(" ")
    for (i in 0 until K) {
        val n = Integer.parseInt(ss[i]) - 1
        var t = map[n]
        if (t == null)
            t = 0
        t++
        map[n] = t

        if (t > max[n])
            res[n] = "YES"
    }

    for (s in res)
        println(s)
}