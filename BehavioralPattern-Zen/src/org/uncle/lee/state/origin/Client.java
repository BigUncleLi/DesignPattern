package org.uncle.lee.state.origin;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new ConcreteStateB());
		context.request();
	}
}
