package org.uncle.lee.facade.business;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.operateA();
		//It's transparent for client to invoke operateB() method
		facade.operateB();
	}
}
