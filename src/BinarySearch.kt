fun main() {
    val arr = listOf(1, 4, 4, 6, 6, 6, 8, 9, 9)
    val search = 9
    var l = 0
    var r = arr.size - 1
    var m = 0
    while (l < r) {
        m = (l + r) / 2
        if (arr[m] >= search)
            r = m
        else
            l = m + 1
    }
    if (l == r)
        m = l
    println("$m")
    var s = -1
    if (arr[m] >= search)
        s  = m

    l = 0
    r = arr.size - 1
    m = 0
    while (l < r) {
        m = (l + r) / 2
        if (arr[m] > search)
            r = m
        else
            l = m + 1
    }
    if (l == r)
        m = l
    println("$m")
    var e = -1
    if (arr[m] > search)
        e  = m
    else
        e = m + 1

    if (s != -1)
        println("$search count ${e - s}")
}