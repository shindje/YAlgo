fun main() {
    val N = Integer.parseInt(readLine())
    val map = mutableMapOf<String, String>()
    val map2 = mutableMapOf<String, String>()
    for (i in 1..N) {
        val ss = readLine()!!.split(" ")
        map.put(ss[0], ss[1])
        map2.put(ss[1], ss[0])
    }
    val check = readLine()
    var res = map.get(check)
    if (res != null)
        print(res)
    else {
        res = map2.get(check)
        print(res)
    }
}