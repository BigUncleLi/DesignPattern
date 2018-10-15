package behavioral.command

class ConcreateCommandB(receiver: Receiver) : Command(receiver) {
    override fun execute() {
        println("command B : trigger receiver func B")
        receiver.funcB()
    }
}