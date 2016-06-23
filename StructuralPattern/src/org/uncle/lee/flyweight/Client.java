package org.uncle.lee.flyweight;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory flyweightPool = new FlyweightFactory();
		
		showFlyweight(flyweightPool, "flyweightA");
		showFlyweight(flyweightPool, "flyweightA");
	}

	private static void showFlyweight(FlyweightFactory flyweightPool, String name) {
		AbstractFlyweight flyweightA = flyweightPool.getFlyweight(name);
		flyweightA.doSomething();
	}
}
