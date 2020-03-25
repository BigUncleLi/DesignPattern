package structural.proxy

fun main(args: Array<String>) {
    val proxy : Subject = Proxy(RealSubject())
    proxy.request()
}