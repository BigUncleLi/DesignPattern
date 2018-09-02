package structural.flyweight

class FlyweightFactory {
    private val flyweightMap: MutableMap<String, Flyweight> = mutableMapOf()

    fun getFlyweight(name: String): Flyweight {
        return if (flyweightMap.containsKey(name)) {
            flyweightMap[name]!!
        } else {
            val flyweight : Flyweight = ConcreteFlyweight(name)
            flyweightMap[flyweight.name] = flyweight
            flyweight
        }
    }
}