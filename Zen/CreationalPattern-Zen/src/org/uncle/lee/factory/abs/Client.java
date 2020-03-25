package org.uncle.lee.factory.abs;

public class Client {
	public static void main(String[] args) {
		AbstractFactory manFactory = new ManFactory();
		manFactory.createBlackHuman().talk();
		manFactory.createWhiteHuman().talk();
		manFactory.createYellowHuman().talk();
		
		AbstractFactory womanFactory = new WomanFactory();
		womanFactory.createBlackHuman().talk();
		womanFactory.createWhiteHuman().talk();
		womanFactory.createYellowHuman().talk();
	}
}
