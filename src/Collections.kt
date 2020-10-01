fun main() {
    // Immutable list array
    val imperials = listOf<String>("Emperor","Darth Vader","Boba Fett","Tarkin")
    println(imperials)

    // Sorting
    println(imperials.sorted())

    // Index
    println(imperials[2])

    println(imperials.first())
    println(imperials.last())

    println(imperials.contains("Luke"))

    // Mutable list array
    val rebels = arrayListOf<String>("Leiah","Luke","Han Solo","Mon Mothma")
    println(rebels)

    // Add to the end of array
    rebels.add("Chewbacca")
    println(rebels)

    // Add to index position
    rebels.add(0, "Lando")
    println(rebels)

    // Get index position
    println(rebels.indexOf("Luke"))

    // Remove from array by element
    rebels.remove("Han Solo")
    println(rebels)

    // Remove from array by index
    rebels.removeAt(0)
    println(rebels)

    // Immutable collection
    val rebelVehicleMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Lansspeeder")
    // Access value by key
    println(rebelVehicleMap["Solo"])
    println(rebelVehicleMap.get("Solo"))
    // Get or default prevents crashed if key is not there
    println(rebelVehicleMap.getOrDefault("Leiah", "This ship does not exist"))

    println(rebelVehicleMap.values)

    // Mutable collection
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Lansspeeder", "Boba Fett" to "Rocket Pack")
    // Change the value of key
    // directly
    rebelVehicles["Luke"] = "XWing"
    // using function
    rebelVehicles.put("Leiah", "Tantive IV")

    println(rebelVehicles)

    // Remove
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)

    // Clear
    rebelVehicles.clear()
    println(rebelVehicles)

    // Check if empty
    println(rebelVehicles.isEmpty())
}