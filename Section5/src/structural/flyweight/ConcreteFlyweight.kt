package structural.flyweight

class ConcreteFlyweight(name : String) : Flyweight(name) {
    override fun operation() {
        println("concrete $name flyweight : operation !")
    }
}