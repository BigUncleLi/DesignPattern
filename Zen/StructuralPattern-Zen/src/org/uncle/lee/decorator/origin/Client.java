package org.uncle.lee.decorator.origin;

public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		testA(component);
		testBA(component);
	}
	
	private static void testA(Component component) {
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
		concreteDecoratorA.operation();
	}

	private static void testBA(Component component) {
		ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
		concreteDecoratorB.operation();
		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
		concreteDecoratorA.operation();
	}
}
