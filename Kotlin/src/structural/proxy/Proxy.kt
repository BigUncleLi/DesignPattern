package structural.proxy

class Proxy(realSubject: RealSubject) : Subject {
    private var realSubject : Subject? = realSubject

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