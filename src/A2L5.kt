fun main() {
    val N = Integer.parseInt(readLine())
    val map = mutableMapOf<Int, Int>()
    for (i in 0 until N) {
        val ss = readLine()!!.split(" ")
        val w = Integer.parseInt(ss[0])
        val h = Integer.parseInt(ss[1])
        val cur = map[w]
        if (cur == null || h > cur)
            map[w] = h
    }
    var maxH = 0L
    for (t in map.values)
        maxH += t
    print(maxH)
}