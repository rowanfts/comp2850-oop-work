// Task 7.7.2: contact database, using a map
fun main () {
    val contacts = mutableMapOf (
        "John" to "1234567890",     //storing phone numbers as Int
        "Sarah" to "1111111111"     //didn't work. Should I use Long?
    ) 

    print("Enter a name: ")
    val name = readln()
    if (name in contacts.keys) {
        println("Contact found.")
        println(contacts[name])
    }
    else {
        print("Contact not found. \nPlease insert ${name}'s phone number: ")
        val number = readln()
        contacts[name] = number
        println("The following information has been added to your contacts:\n${name}, $number")
    }    
}