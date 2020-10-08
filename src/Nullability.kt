fun main() {
    // Needed when we need to declare a variable that can be null
    // Kotlin tries it's best not to allow null
    // Origin of null https://en.wikipedia.org/wiki/Tony_Hoare#Apologies_and_retractions

    var name: String = "AlexL"

    // If we try to assign nul to name, we will get the
//    name = null // Error: "Null can not be a value of a non-null type String"

    var nullableName: String? = "Do i really exist?"
    nullableName = null

//    println(nullableString.length) // Error: "Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?"

    // Null check (Basic example with mutable variable)
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length) // -1

    // Null check with immutable
    val l = if (nullableName != null) nullableName.length else -1
    println(l) // -1

    // Second method, Safe Call Operator
    println(nullableName?.length) // null

    // Third method, Elvis Operator
    val len = nullableName?.length ?: -1
    println(len) // -1

    val noName = nullableName?.length ?: "No one knows me..."
    println(noName)

    // !! (Introduce null pointer exceptions)
    // NOTE: Only use this when you know the value does exist for the variable
//    println(nullableName!!.length) // This will make the app crash as nullableName is null
}