abstract class Appliance{
    var pluggedIn = true
    abstract val color:String
    abstract fun consumePower()
}
class CoffeeMaker: Appliance(){
    override val color = ""
    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming power")
    }
    fun fillWithWater(){
        println("Fill with water")
    }
    fun makeCoffee(){
        println("Make the coffee")
    }
}