fun main(args: Array<String>) {
	print("""
PIZZA MENU

(a) Margherita
(b) Quattro Stagioni
(c) Seafood
(d) Hawaiian 

""")
	do {
		print("Choose your pizza (a-d): ")
		var choice = readln().lowercase() 
	} while (choice.length != 1 || choice.first() !in 'a'..'d')
	
	println("Order accepted.")
}
