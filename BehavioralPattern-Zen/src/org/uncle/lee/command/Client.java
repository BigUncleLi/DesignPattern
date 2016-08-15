package org.uncle.lee.command;

public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Receiver receiverA = new ReceiverA();
		ConcreteCommandA concreteCommandA = new ConcreteCommandA(receiverA);
		invoker.setCommand(concreteCommandA);
		invoker.invoke();
	}
}
