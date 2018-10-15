package behavioral.command

abstract class Command (val receiver: Receiver) {
    abstract fun execute()
}