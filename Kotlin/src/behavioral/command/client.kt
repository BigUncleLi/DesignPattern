package behavioral.command

fun main(args: Array<String>) {
    val receiver = Receiver()

    val commandA : Command = ConcreteCommandA(receiver)
    val commandB : Command = ConcreteCommandB(receiver)

    val invoke = Invoker()
    invoke.addCommand(commandA)
    invoke.addCommand(commandB)
    invoke.call()
}