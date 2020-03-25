package structural.flyweight

fun main(args: Array<String>) {
    val flyweightFactory = FlyweightFactory()

    repeat(2) {
        flyweightFactory.getFlyweight("hello").operation()
    }
}