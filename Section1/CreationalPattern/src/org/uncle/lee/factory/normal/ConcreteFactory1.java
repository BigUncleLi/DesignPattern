package org.uncle.lee.factory.normal;

public class ConcreteFactory1 implements Factory {
	@Override
	public Product createProduct() {
		return new ConcreteProduct1();
	}
}
