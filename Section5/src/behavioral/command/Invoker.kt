package behavioral.command

class Invoker {
    private val commandList : MutableList<Command> = mutableListOf()

    public fun addCommand(command : Command) {
        if (!this.commandList.contains(command)) {
            this.commandList.add(command)
        }
    }

    public fun removeCommand(command : Command) {
        if (this.commandList.contains(command)) {
            this.commandList.remove(command)
        }
    }

    public fun call() {
        this.commandList.forEach {
            it.execute()
        }
    }
}