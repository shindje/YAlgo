//start 16:22
fun main() {
    var ss = readLine()!!.split(" ")
    val N = Integer.parseInt(ss[0])
    val R = Integer.parseInt(ss[1])
    ss = readLine()!!.split(" ")
    val D = Array(N){idx -> Integer.parseInt(ss[idx])}

    var cnt = 0L
    var idx1 = 0
    var idx2 = 1
    while (idx2 < N) {
        while (idx2 < N && D[idx2] - D[idx1] <= R)
            idx2++
        cnt = cnt + (N - idx2)
        idx1++
    }
    print(cnt)
}