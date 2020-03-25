package org.uncle.lee.factory.abs;

public class ConcreteFactory1 implements Factory {
	@Override
	public Product createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public Product createProductB() {
		return new ConcreteProductB1();
	}
}
