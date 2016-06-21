package org.uncle.lee.factory.abs;

public class Client {
	public static void main(String[] args) {
		Factory factory1 = new ConcreteFactory1();
		Factory factory2 = new ConcreteFactory2();
		
		showProductA1(factory1);
		showProductA2(factory2);
		showProductB1(factory1);
		showProductB2(factory2);
	}

	private static void showProductA1(Factory factory) {
		factory.createProductA().operate();
	}

	private static void showProductA2(Factory factory) {
		factory.createProductA().operate();
	}
	
	private static void showProductB1(Factory factory) {
		factory.createProductB().operate();
	}
	
	private static void showProductB2(Factory factory) {
		factory.createProductB().operate();
	}
}
