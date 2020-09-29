fun main() {

    // val is not mutable
    val name: String = "Alex"
    // var is mutable
    var isAwesome = false
    isAwesome = true

    println("Is " + name + " awesome? The answer is : " + isAwesome)

    var a = 3 // Int
    var b = 6
    println(a + b)

    var doubleNum: Double = 123.45 // Double, 64 bit number
    val floatNum: Float = 123.45f // Float, 32 bit
    val longNum: Long = 12345678987654L // Long, 64 bit

    val numToString = a.toString()

    var hero: String = "batman"
    hero = "superman"
}