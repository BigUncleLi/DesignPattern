package structural.facade

fun main(args: Array<String>) {
    val facade = Facade()
    facade.subSystemA = SubSystemA()
    facade.subSystemB = SubSystemB()
    facade.subSystemC = SubSystemC()

    facade.doAB()
    facade.doBC()
}