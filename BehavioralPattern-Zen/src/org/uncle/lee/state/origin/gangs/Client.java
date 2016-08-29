package org.uncle.lee.state.origin.gangs;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(Context.STATE_A);
		context.request();
	}
}
