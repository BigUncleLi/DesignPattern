package structural.decorator

class ConcreteDecorator(component: Component) : Decorator(component) {
    override fun doFirst() {
        println("ConcreteDecorator doFirst")
    }

    override fun doLast() {
        println("ConcreteDecorator doLast")
    }
}