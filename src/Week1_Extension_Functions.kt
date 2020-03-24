// String is a receiver class member
// we attach the function on it

fun String.lastChar() = get(length - 1)
// when calling from Java, the receiver becomes the first argument of a static function
// cannot call a private member outside of this class


// kotlin standard library is just java stdlib with extensions

fun main(args: Array<String>) {
    println("abc".lastChar())

    val mylist = listOf<String>("hello", "world", "from", "Kotlin")
    for ((idx, elem) in mylist.withIndex()) {
        println("$idx is $elem")
    }
    println(mylist.javaClass)
}