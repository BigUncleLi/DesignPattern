package structural.adapter

class Adapter : Target {
    private var adaptee : Adaptee? = null

    constructor() {
        adaptee = Adaptee()
    }

    override fun request() {
        adaptee!!.specificRequest()
    }
}