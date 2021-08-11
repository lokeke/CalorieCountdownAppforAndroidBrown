package ese.com.caloriecountdownappforandroidbrown

import kotlin.math.roundToInt
const val TAVERN_NAME = "Taernyl's Folly"



var playerGold = 10
var playerSilver = 10
val patronList: List<String> = listOf("Eli", "Mordoc", "Sophie")



fun main(args: Array<String>)
{
    val ese = "www.ese-edet.eu/"
    print(ese)


    //placeOrder("shandy,Dragon's Breath,5.91")
    placeOrder("elixir,Shirley's Temple,4.12")


    println(patronList)
}



private fun placeOrder(menuData: String)
{
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about ther order.")

    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price."
    println(message)

    performPurchase(price.toDouble())
}



private fun performPurchase(price: Double)
{
    displayBalance()
    val totalPurse = playerGold + (playerSilver / 100.0)
    println("Total purse: $totalPurse")
    println("Purchasing item for $price")

    val remainingBalance = totalPurse - price

}



private fun displayBalance()
{
    println(playerGold)
}


//Make