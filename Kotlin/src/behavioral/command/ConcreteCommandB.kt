package behavioral.command

class ConcreteCommandB(receiver: Receiver) : Command(receiver) {
    override fun execute() {
        println("command B : trigger receiver func B")
        receiver.funcB()
    }
}