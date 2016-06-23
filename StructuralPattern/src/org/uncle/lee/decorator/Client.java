package org.uncle.lee.decorator;

public class Client {
	public static void main(String[] args) {
		Component concreteComponent = new ConcreteComponent();
		
		Decorator decoratorA = new ConcreteDecoratorA(concreteComponent);
		decoratorA.operate();
		
		Decorator decoratorB = new ConcreteDecoratorB(concreteComponent);
		decoratorB.operate();
	}
}
