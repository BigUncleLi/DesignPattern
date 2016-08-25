package org.uncle.lee.facade.limited;

public class Client {
	public static void main(String[] args) {
		LimiteBFacade facade = new LimiteBFacade();
		facade.operateB();
	}
}
