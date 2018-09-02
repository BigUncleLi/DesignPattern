package structural.decorator

abstract class Decorator(component: Component) : Component {
    private val component : Component? = component

    abstract fun doFirst()

    override fun operation() {
        doFirst()
        component!!.operation()
        doLast()
    }

    abstract fun doLast()
}