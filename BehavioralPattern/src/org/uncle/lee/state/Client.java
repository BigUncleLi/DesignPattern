package org.uncle.lee.state;

import org.uncle.lee.state.Context.ContextType;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setType(ContextType.TYPEA);
		context.request();
		
		context.setType(ContextType.TYPEB);
		context.request();
	}
}
