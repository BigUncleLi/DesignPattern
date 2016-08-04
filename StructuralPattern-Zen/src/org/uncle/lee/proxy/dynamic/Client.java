package org.uncle.lee.proxy.dynamic;

public class Client {
	public static void main(String[] args) {
		Subject subject = new RealSubject();
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		proxy.doSomeThing();
	}
}
