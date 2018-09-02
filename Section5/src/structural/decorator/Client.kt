package structural.decorator

fun main(args: Array<String>) {
    val decorator : Decorator = ConcreteDecorator(ConcreteComponent())
    decorator.operation()
}