fun main() {
    // Escape characters with strings
    val str = "May the force be with you."

    val strNewLine = "May the force \nbe with you."
    println(strNewLine)

    val strTab = "May the force \tbe with you."
    println(strTab)

    val strBackSpace = "May the force\b be with you."
    println(strBackSpace)

    val strReturnAfter = "May the force\r be with you."
    println(strReturnAfter)

    val strDoubleQuote = "May the force\" be with you."
    println(strDoubleQuote)

    val strBackSlash = "May the force\\ be with you."
    println(strBackSlash)

    val strDollarSign = "May the \$force be with you."
    println(strDollarSign)

    // Raw strings

    val rawStringWithMargins = """A long time ago,
        in a galaxy
        far, far, away...
        BUMM BUMM BUMMM
    """
    println(rawStringWithMargins)

    val rawStringWithoutMargin = """ |A long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMMM
    """.trimMargin()
    println(rawStringWithoutMargin)

    val rawStringTrimMargin = """
        A long time ago,
        in a galaxy
        far, far, away...
        BUMM BUMM BUMMM
    """.trimIndent()
    println(rawStringTrimMargin)

    // Looping on strings
    for (char in "force") {
        println(char)
    }

    // Compare strings
    var contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    var contains  = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()
    println(uppercase)
    println(lowercase)

    // Conversions
    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    // Subsequence
    val subsequence = str.subSequence(4,13)
    println(subsequence)

    // String templates
    val luke = "Luke Skywalker"
    val color = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$luke has a $color lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name \"${luke.toUpperCase()}\" has ${luke.length} characters")
}
