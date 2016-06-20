package org.uncle.lee.factory.simple;


public class Client {
	public static void main(String[] args) {
		Factory factory = new Factory();
		showConcreteProduct1(factory);
		showConcreteProduct2(factory);
	}

	private static void showConcreteProduct1(Factory factory) {
		Product concreteProduct1 = factory.createProductBaseOnType(Factory.CONCRETE_PRODUCT_1);
		concreteProduct1.operate();
	}
	
	private static void showConcreteProduct2(Factory factory) {
		Product concreateProduct2 = factory.createProductBaseOnType(Factory.CONCRETE_PRODUCT_2);
		concreateProduct2.operate();
	}
}
