fun main() {
    val arr = listOf(1, 4, 4, 6, 8, 9)
    val search = -1
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
    if (arr[m] != search)
        println("not found")
}