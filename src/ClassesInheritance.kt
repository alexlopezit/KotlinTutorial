// Classes with common functionality

// In Kotlin all classes are final or sealed meaning the can't be inherited from, so we need declare the class as "open"
open class Vehicle(val make: String, val model: String) {
    // "open" here allows this function to be overridden
    open fun accelerate(){
        println("vroom vroom")
    }

    fun park(){
        println("parking the vehicle")
    }

    fun brake(){
        println("STOP")
    }
}

// Class that inherits (using : )
// When we initialize a class that inherits, we still need to pass the parameter that the parent class also needs
class Carro(make: String, model: String, var color: String) : Vehicle(make, model){
    // Override parent functions
    override fun accelerate(){
        println("We are going to ludicrous mode!")

        // We can still also call the parent method using "super"
        super.accelerate()
    }
}

class Camion(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model){
    fun tow(){
        println("headed out to the mountains")
    }
}

// This is also valis if a class does not have any methods (No {} needed)
class Bike(make: String, model: String, val maxSpeed: Int) : Vehicle(make, model)


fun main() {

    var tesla = Carro("Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Camion("Ford", "F-150", 10000)
    truck.park()
    truck.brake()
    truck.tow()
}
