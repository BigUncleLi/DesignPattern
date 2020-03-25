package structural.bridge

class RefinedAbstraction(implementor: Implementor) : Abstraction(implementor) {
    override fun operation() {
        doJobA()
        super.operation()
        doJobB()
    }

    private fun doJobA() {
        println("do Job A")
    }

    private fun doJobB() {
        println("do Job b")
    }
}