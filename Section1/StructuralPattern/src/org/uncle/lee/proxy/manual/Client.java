package org.uncle.lee.proxy.manual;

public class Client {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		Proxy proxy = new Proxy(realSubject);
		proxy.operate();
	}
}
