fun main() {
    fun forceChoke () {
        println("You have failed me for the last time Admiral...")
    }

    forceChoke()

    fun makeEntrance (line: String) {
        println(line)
    }

    makeEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys (rebels: Int, ewoks: Int): Int {
        return rebels + ewoks
    }

    val rebels = calculateNumberGoodGuys(5, 7)
    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5, 7)} rebel scum")

    // Default value
    fun vaderIsFeeling (mood: String = "angry") {
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("meh")
}