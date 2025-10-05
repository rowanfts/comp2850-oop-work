fun main(args: Array<String>) {
	print("""
PIZZA MENU

(a) Margherita
(b) Quattro Stagioni
(c) Seafood
(d) Hawaiian

Choose your pizza (a-d): """)

	val choice = readln().lowercase() 
	if (choice.length == 1 && choice.first() in 'a'..'d'){
    	println("Order accepted.")
    }
    else{
    	println("Invalid choice!")
    }
}
