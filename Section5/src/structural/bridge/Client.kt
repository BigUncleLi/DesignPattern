package structural.bridge

fun main(args: Array<String>) {
    testConcreteImplementor(ConcreteImplementorA())
    testConcreteImplementor(ConcreteImplementorB())
}

fun testConcreteImplementor(concreteImplementorA: Implementor) {
    val abstraction : Abstraction = RefinedAbstraction(concreteImplementorA)
    abstraction.operation()
}