// Declare class name "Car"
// Passing to the constructor the variables we want to have
class Car (val make: String, val model: String, var color: String) {
    // Class methods
    fun accelerate(){
        println("vroom vroom")
    }

    fun details(){
        println("This is a $color $make $model")
    }
}

class Truck(val make: String, val model: String, val towingCapacity: Int) {
    fun tow(){
        println("taking the horses to the rodeo")
    }

    fun details(){
        println("The $make $model as a towing capacity of $towingCapacity lbs")
    }
}

fun main() {

//    val car = CarDemo("Toyota", "Rav4") // Usually classes are on independent class files
    // For this demo we will do it on this file above
    val car = Car("Toyota", "Rav4", "red")

    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()
    truck.details()
}