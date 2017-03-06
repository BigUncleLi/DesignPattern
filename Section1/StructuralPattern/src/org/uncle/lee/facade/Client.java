package org.uncle.lee.facade;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.doAB();
		facade.doBC();
		facade.doCA();
	}
}
