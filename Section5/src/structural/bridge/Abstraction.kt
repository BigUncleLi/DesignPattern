package structural.bridge

abstract class Abstraction {
    private var implementor : Implementor? = null

    constructor(implementor: Implementor) {
        this.implementor = implementor
    }

    open fun operation() {
        implementor!!.operationImp()
    }
}