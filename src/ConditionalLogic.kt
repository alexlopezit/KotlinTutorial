fun main() {

    val a = 2
    val b = 2
    val c = 3

    // Compare values
    if (a == b) {
        println("A is equal to B")
    }

    if (a != c) {
        println("A is not equal to C")
    }

    val balance = 100
    val price = 50

    if (balance >= price) {
        println("You can buy this item!")
    } else {
        println("Sorry, you broke!")
    }

    val degrees = 18

    // == != > < <= >=
    if (degrees >= 25){
        println("This is a nice weather")
    } else if(degrees < 25 && degrees >= 10) {
        println("Grab a sweater")
    } else {
        println("It's cold!")
    }

    // Boolean
    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Lets get pizza!")
    }

    // When (Similar to switch in JS)
    val x = 3

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("x does not equual 1 or 2")
    }

    // Combine all
    fun vaderIsFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("run for the hills, Vader is $mood")
        } else {
            println("whatever you do, don't make him angry")
        }
    }

    vaderIsFeeling()
    vaderIsFeeling("happy")
}