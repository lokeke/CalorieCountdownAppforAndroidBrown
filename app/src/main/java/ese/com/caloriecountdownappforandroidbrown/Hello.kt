package ese.com.caloriecountdownappforandroidbrown

fun main(args: Array<String>)
{
    val name = "Madrigal"
    val isBlessed = true
    var healthPoints = 49
    val isImmortal = false
    var green = "Green"
    var blue = "Blue"

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal

    if(auraVisible) println("$green") else println("$blue")

    print((-7..10).toList())


    //val healthStatus =
}