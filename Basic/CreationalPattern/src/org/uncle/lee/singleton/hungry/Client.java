package org.uncle.lee.singleton.hungry;

public class Client {
	public static void main(String[] args) {
		HungrySingleton.getInstance().operate();
	}
}
