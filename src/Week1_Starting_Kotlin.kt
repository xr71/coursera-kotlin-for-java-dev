data class Person(val name: String, val age: Int)

val person = Person("Alice", 27)

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
    println("Hello ${person.name}, you are ${person.age}.")
}
