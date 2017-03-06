package org.uncle.lee.command.demo;

public class Client {
	public static void main(String[] args) {
		Command detelePageCommand = new DetelePageCommand();
		Invoker invoker = Invoker.obtain(detelePageCommand);
		invoker.invoke();
	}
}
