fun main() {
    val rebels = arrayListOf<String>("Leiah","Luke","Han Solo","Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Lansspeeder", "Boba Fett" to "Rocket Pack")

    // For loops
    // For an array
    for (rebel in rebels) {
        println("Name: $rebel")
    }

    // For a map
    for ((key, value) in rebelVehicles) {
        println("$key gets around in their $value")
    }

    // While loop
    var x = 10

    while (x > 0) {
        println(x)
        x-- // Decrease value of x (x = x - 1)
    }

    var y = 0
    while (y <= 10) {
        println(y)
        y++ // Increase value of y
    }
}