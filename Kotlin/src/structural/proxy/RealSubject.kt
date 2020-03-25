package structural.proxy

class RealSubject : Subject {
    override fun request() {
        println("Real Subject request ...")
    }
}