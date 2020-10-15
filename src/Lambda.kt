fun main() {
    // Lambda expression
    // Always surrounded by curly braces
    // Is a function literal i.e. function that is not declared, but passed immediately as an expression
    val printMessage = { message: String -> println(message)}
    printMessage("Hello world!")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5,3))

    // Same as above but cleaner
    val sumB: (Int, Int) -> Int = {x,y -> x + y}
    println(sumB(5,3))

    // Dealing with async requests, so we don't hold other operations
    // Dummy download request function
    // Note: "Unit" is the equivalent of void in Kotlin
    fun downloadData(url: String, completion: ()-> Unit) {
        // send a download request
        // we got back data
        // there where no error
        completion()
    }

    // call downloadDataFunction
    downloadData("fakeUrl.com", {
        println("The code in this block, will only run after the completion()")
    })

    fun downloadCardData(url: String, completion: (Car) -> Unit) {
        // send a download request
        // we got back data
        var car = Car("Tesla", "ModelX", "Blue")
        // there where no error
        completion(car)
    }

    // As the last argument is a Lambda expression we can move the curly braces outside
    downloadCardData("fakeUrl.com"){car ->
        println(car.color)
        println(car.make)
    }

    // If our Lambda expression has "only one" parameter, we can use "it" instead
    downloadCardData("fakeUrl.com"){
        println(it.model)
    }

    // Another dummy request handling success error
    // completion can be anything
    // change the value of "webRequestSuccess" to test
    fun downloadTruckData(url: String, anything: (Truck?, Boolean) -> Unit) {
        // send a download request
        // we get the results back
        val webRequestSuccess = false
        if(webRequestSuccess) {
            var truck = Truck("Ford", "F-150", 10000)
            anything(truck, true)
        } else {
            anything(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){ truck, success ->
        if(success){
            // do something with the truck
            truck?.tow()
        } else {
            // handle the web request failure
            println("Something went wrong!")
        }
    }

}