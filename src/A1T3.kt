fun main() {
    val N = Integer.parseInt(readLine())
    val YY = Array(N) { 0 }
    for (i in 0 until N) {
        val ss = readLine()!!.split(" ")
        YY[i] = Integer.parseInt(ss[1])
    }
    val M = Integer.parseInt(readLine())
    val TStart = Array(M) { 0 }
    val TEnd = Array(M) { 0 }
    val Tback = Array(M) { 0 }
    for (i in 0 until M) {
        val ss = readLine()!!.split(" ")
        val start = Integer.parseInt(ss[0])
        val end = Integer.parseInt(ss[1])
        if (start <= end) {
            TStart[i] = start
            TEnd[i] = end
        } else {
            TStart[i] = end
            TEnd[i] = start
            Tback[i] = 1
        }
    }

    val summUp = Array(N) {0}
    val summDown = Array(N) {0}
    for (i in 1 until N) {
        val diff = YY[i] - YY[i-1]
        summUp[i] = summUp[i-1]
        summDown[i] = summDown[i-1]
        if (diff > 0)
            summUp[i] = summUp[i] + diff
        else
            summDown[i] = summDown[i-1] + diff
    }

    for (i in 0 until M) {
        if (Tback[i] == 0)
            println(summUp[TEnd[i] - 1] - summUp[TStart[i] - 1])
        else
            println((summDown[TEnd[i] - 1] - summDown[TStart[i] - 1]) * -1)
    }
}