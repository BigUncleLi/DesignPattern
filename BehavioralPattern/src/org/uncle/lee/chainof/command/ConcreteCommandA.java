
package org.uncle.lee.chainof.command;

public class ConcreteCommandA extends Command {
	public ConcreteCommandA(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		super.getReceiver().actionA();
	}
}
