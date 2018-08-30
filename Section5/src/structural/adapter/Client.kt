package structural.adapter

fun main(args: Array<String>) {
    val target : Target = Adapter()
    target.request()
}