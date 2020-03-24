fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}

// if you have extensions with the same signature as a member
// the member will always win
// extensions are just static functions in Java
// they cannot override member functions
