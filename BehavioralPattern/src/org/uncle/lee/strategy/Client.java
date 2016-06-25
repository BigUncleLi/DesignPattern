package org.uncle.lee.strategy;

public class Client {
	public static void main(String[] args) {
		showStrategyA();
		showStrategyB();
	}
	
	private static void showStrategyA(){
		Context context = new Context(new ConcreteStrategyA());
		context.opreate();
	}
	
	private static void showStrategyB(){
		Context context = new Context(new ConcreteStrategyB());
		context.opreate();
	}
}
