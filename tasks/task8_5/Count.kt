fun main() {
    val text = "Hello World!"
    println(text.howMany(isEnglishVowel(e)))        //IM SO CONFUSED HOW DOES THIS WORK WHATS THE POINT
}

fun isEnglishVowel(c: Char) = c.lowercase() in "aeiou"

fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}
