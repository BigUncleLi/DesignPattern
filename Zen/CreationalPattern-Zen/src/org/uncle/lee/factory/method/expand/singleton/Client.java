package org.uncle.lee.factory.method.expand.singleton;

public class Client {
	public static void main(String[] args) {
		SingletonFactory factory = new SingletonFactory();
		factory.createSingleton().showInstance();
		factory.createSingleton().showInstance();
	}
}
