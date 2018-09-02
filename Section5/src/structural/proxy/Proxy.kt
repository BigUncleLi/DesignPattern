package structural.proxy

class Proxy : Subject {
    private var realSubject : Subject? = null

    constructor(realSubject: Subject) {
        this.realSubject = realSubject
    }

    private fun doFirst() {
        println("Proxy do first ...")
    }

    override fun request() {
        doFirst()
        realSubject!!.request()
        doLast()
    }

    private fun doLast() {
        println("Proxy do last ...")
    }

}