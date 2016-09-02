package org.uncle.lee.bridge.origin;

public class Client {
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementorB();
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.operate();
	}
}
