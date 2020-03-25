package org.uncle.lee.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		
		showABenz(director);
		showABmw(director);
	}

	private static void showABenz(Director director) {
		CarBuilder aBenz = new BenzBuilder();
		director.constructABenz(aBenz);
	}
	
	private static void showABmw(Director director) {
		CarBuilder aBmw = new BmwBuilder();
		director.constructABmw(aBmw);
	}
}
