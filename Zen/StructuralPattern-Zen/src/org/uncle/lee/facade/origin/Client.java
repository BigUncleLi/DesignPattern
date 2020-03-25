package org.uncle.lee.facade.origin;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.operateA();
		facade.operateB();
		facade.operateC();
	}
}
