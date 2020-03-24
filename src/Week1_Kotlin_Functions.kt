// you can declare functions in Kotlin just about anywhere
// top level
// member function
// local function

fun topLevelFunction() {
    println("I'm a top level function")
}

class PersonGreet(val name: String, val age: Int) {
    fun greet() {
        println("Hello, I am ${this.name}, and I am ${this.age}.")
        println("And I am a member function")
    }
}

fun localFunction() {
    fun inner() = 3
    println("I'm a local level function")
}

fun main(args: Array<String>) {
    val alice = PersonGreet("Alice", 27)
    alice.greet()

    topLevelFunction()
    localFunction()
    println("\n\n")

    // control structure
    // there is no ternary structure in Kotlin

    // break is not needed in Kotlin when using when

    val color = "BLUE"
    when (color) {
        "BLUE" -> println("color is blue")
        "RED" -> println("color is red")
        "ORANGE" -> println("color is orange")
    }

    // when can also be used for checking types
    // when can be used for multiple value checks
    val response = "n"
    when (response) {
        "y", "Y", "yes", "Yes" -> println("Response is YES")
        else -> println("Response is not YES")
    }

    fun getMyFavoritePet() = "Cat"

    // you can assign a variable in local scope and have access to it
    // after expression valuation
    when (val pet = getMyFavoritePet()) {
        "Cat" -> println("meow")
        "Dog" -> println("woof")
        else -> ":("
    }

    println("\n\n")


    // loops
    var x = 0
    while(x < 3) {
        println(x)
        x++
    }

    // range and until
    for (i in 1..9) {print(i)}
    println()
    for (i in 1 until 9) {print(i)}  // notice this excludes upper bound
    println()

    // a bit more sophisticated ranges
    for (i in 9 downTo 0 step 2) {print(i)}
    println()
    for (ch in "hello world") print(ch+1) // iterating over string and incrementing each char


    // comparing strings
    println("\n\n")
    println("ball" in "a".."k") // true
    println("soccer" in "a".."k") // false
}
