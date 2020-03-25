package structural.bridge

abstract class Abstraction(implementor: Implementor) {
    private var implementor : Implementor? = implementor

    open fun operation() {
        implementor!!.operationImp()
    }
}