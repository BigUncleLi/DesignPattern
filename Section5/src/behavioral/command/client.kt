package behavioral.command

fun main(args: Array<String>) {
    val receiver = Receiver()

    val commandA : Command = ConcreateCommandA(receiver)
    val commandB : Command = ConcreateCommandB(receiver)

    val invoke = Invoker()
    invoke.addCommand(commandA)
    invoke.addCommand(commandB)
    invoke.call()
}