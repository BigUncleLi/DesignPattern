package org.uncle.lee.strategy.origin;

public class Client {
	public static void main(String[] args) {
		testStrategyA();
		testStrategyB();
	}
	
	private static void testStrategyA(){
		Context contextA = new Context(new ConcreteStrategyA());
		contextA.contextInterface();
	}
	
	private static void testStrategyB() {
		Context contextB = new Context(new ConcreteStrategyB());
		contextB.contextInterface();
	}
}
