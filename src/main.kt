/**
 * @author CodeTober
 *
 * Functions Tutorial
 */


const val STORE_NAME = "MoonBucks"

fun main(args: Array<String>) {

    // Store Enter Text
    println("Welcome to $STORE_NAME! (No pictures please)\n")

    // First Order
    val drinkNameOne = "DarkSide Frap"
    val drinkPriceOne = 5.99
    val customerNameOne = "Carat"
    val drinkQtyOne = 2

    // Display order for first customer
    println("$customerNameOne orders $drinkNameOne(x$drinkQtyOne) for a total of \$${drinkPriceOne * drinkQtyOne}")

    // Second Order
    val drinkNameTwo = "Zero-Gravity Mocha"
    val drinkPriceTwo = 6.99
    val customerNameTwo = "Turbo"
    val drinkQtyTwo = 1

    // Display order for second customer
    println("$customerNameTwo orders $drinkNameTwo(x$drinkQtyTwo) for a total of \$${drinkPriceTwo * drinkQtyTwo}")

    // Store Exit Text
    println("\nThanks for shopping at $STORE_NAME! (Don't, tell your friends)")

    println("\n\n-------Beginning Function Definition Examples---------\n\n")

    //Let's refactor this into functions
    printWelcomeMessage()

    // First Order
    placeOrder("DarkSide Frap", "Carat", 2)
    // Second Order with 'named params' - notice we left out 'qty' in favor of its default value
    placeOrder(customerName = "Turbo", drinkName = "Zero-Gravity Mocha")

    printExitMessage()
}

private fun placeOrder(drinkName: String, customerName: String, qty: Int = 1){

    val drinkTotal = calculateDrinkPrice(drinkName, qty)
    println("$customerName orders $drinkName(x$qty) for a total of \$$drinkTotal")

}

private fun calculateDrinkPrice(drinkName: String, qty: Int): Double {
    val drinkPrice = when(drinkName){
        "DarkSide Frap" -> 5.99
        "Zero-Gravity Mocha" -> 6.99
        else -> 0.00
    }

    val drinkTotal = (drinkPrice * qty)
    return drinkTotal
}

private fun printWelcomeMessage() =
        println("Welcome to $STORE_NAME! (No pictures please)\n")

private fun printExitMessage() = println("\nThanks for shopping at $STORE_NAME! (Don't, tell your friends)")
