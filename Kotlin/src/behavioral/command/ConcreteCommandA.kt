package behavioral.command

class ConcreteCommandA(receiver: Receiver) : Command(receiver) {
    override fun execute() {
        println("command A : trigger receiver func A")
        receiver.funcA()
    }
}