fun main() {
    val text = "Hello World!"
    //println(text.howMany(isEnglishVowel()))  //this is incorrect because it passes in the RETURN VALUE of isEnglishVowel no the function itself!!!!
    println(text.howMany(::isEnglishVowel))    //this is how to pass in the function itself
    println(text.howMany({it.lowercase() in "aeiou"})) //this effectively does the same thing as the previous line, but without having to go through the named isEnglishVowel function
    //println(text.howMany({it == 'l'}))        //friends' technique applied above ^

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
