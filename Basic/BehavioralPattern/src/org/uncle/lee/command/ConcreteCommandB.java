package org.uncle.lee.command;

public class ConcreteCommandB extends Command {

	public ConcreteCommandB(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		super.getReceiver().actionB();
	}
}
