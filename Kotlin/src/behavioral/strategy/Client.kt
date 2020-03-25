package behavioral.strategy

fun main(args: Array<String>) {
    testStrategy(ConcreteStrategyA())
    testStrategy(ConcreteStrategyB())
}

fun testStrategy(concreteStrategy: Strategy) {
    val context = Context()
    context.setStrategy(concreteStrategy)
    context.algorithm()
}
