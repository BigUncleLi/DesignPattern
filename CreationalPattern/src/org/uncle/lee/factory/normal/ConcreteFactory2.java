package org.uncle.lee.factory.normal;

public class ConcreteFactory2 implements Factory {
	@Override
	public Product createProduct() {
		return new ConcreteProduct2();
	}
}
