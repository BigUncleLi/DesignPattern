package org.uncle.lee.factory.method.expand.singleton.more;

public class Client {
	public static void main(String[] args) {
		SingletonTypeFactory factory = new SingletonTypeFactory();
		
		TestA aInstance0 = (TestA) factory.createInstance(TestA.class);
		aInstance0.show();
		TestA aInstance1 = (TestA) factory.createInstance(TestA.class);
		aInstance1.show();
		
		TestB bInstance0 = (TestB) factory.createInstance(TestB.class);
		bInstance0.show();
		TestB bInstance1 = (TestB) factory.createInstance(TestB.class);
		bInstance1.show();
	}
}
