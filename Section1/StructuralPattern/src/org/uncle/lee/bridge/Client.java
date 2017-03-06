package org.uncle.lee.bridge;

public class Client {
	public static void main(String[] args) {
		showImplementA();
		showImplementB();
	}

	private static void showImplementA() {
		Implementor implementorA = new ConcreteImplementorA();
		Abstraction abstractionA = new RefinedAbstraction(implementorA);
		abstractionA.operate();
	}
	
	private static void showImplementB() {
		Implementor implementorB = new ConcreteImplementorB();
		Abstraction abstractionB = new RefinedAbstraction(implementorB);
		abstractionB.operate();
	}
}
