package creational.factory.normal

fun main(args: Array<String>) {
    createProduct1()
    createProduct2()
}

fun createProduct1() {
    val factory : Factory = ConcreateFactory1()
    factory.createProduct().operate()
}

fun createProduct2() {
    val factory : Factory = ConcreateFactory2()
    factory.createProduct().operate()
}