package org.uncle.lee.command;

public class ConcreteCommandA implements Command{
	private Receiver receiverA;
	
	public ConcreteCommandA(Receiver receiverA){
		this.receiverA = receiverA;
	}

	@Override
	public void execute() {
		receiverA.doSomething();
	}
}
