// Implement the function that checks whether a string is a valid identifier. A valid identifier is a non-empty
// string that starts with a letter or underscore and consists of only letters, digits and underscores.

fun isValidIdentifier(s: String): Boolean {
    if (s.length == 0 || s[0] in '0'..'9') {
        return false
    }

    fun isValidChar(c: Char) : Boolean {
        return c == '_' || c.toLowerCase().isLetterOrDigit()
    }

    for (ch in s) {
        if (!isValidChar((ch))) {
            return false
        }
    }

    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

