package org.uncle.lee.chainof.command;

public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command commandA = new ConcreteCommandA(receiver);
		Command commandB = new ConcreteCommandB(receiver);
		
		Invoker invoker = new Invoker();
		
		invokeCommand(commandA, invoker);
		invokeCommand(commandB, invoker);
		removeCommand(commandA, invoker);
	}

	private static void invokeCommand(Command command, Invoker invoker) {
		invoker.addCommand(command);
		invoker.invoke();
	}
	
	private static void removeCommand(Command command, Invoker invoker) {
		invoker.removeCommand(command);
		invoker.invoke();
	}
}
