package org.uncle.lee.state.origin.zen;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new State2());
		context.handle1();
	}
}
