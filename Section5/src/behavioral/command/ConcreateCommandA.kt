package behavioral.command

class ConcreateCommandA(receiver: Receiver) : Command(receiver) {
    override fun execute() {
        println("command A : trigger receiver func A")
        receiver.funcA()
    }
}