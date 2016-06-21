package org.uncle.lee.factory.abs;

public class ConcreteFactory2 implements Factory {
	@Override
	public Product createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public Product createProductB() {
		return new ConcreteProductB2();
	}
}
