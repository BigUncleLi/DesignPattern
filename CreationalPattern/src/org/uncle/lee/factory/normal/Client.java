package org.uncle.lee.factory.normal;

public class Client {
	public static void main(String[] args) {
		showConcreteProduct1();
		showConcreteProduct2();
	}

	private static void showConcreteProduct1() {
		Factory concreteFactory1 = new ConcreteFactory1();
		Product createProduct1 = concreteFactory1.createProduct();
		createProduct1.operate();
	}
	
	private static void showConcreteProduct2() {
		Factory concreteFactory2 = new ConcreteFactory2();
		Product createProduct2 = concreteFactory2.createProduct();
		createProduct2.operate();
	}
}
