package org.uncle.lee.proxy.jdk;

import java.lang.reflect.Proxy;

public class Client {
	private static Subject realSubject;

	public static void main(String[] args) {
		realSubject = new RealSubject();
		MyInvocationHandler handler = new MyInvocationHandler(realSubject);
		Subject subjectProxy = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), 
				realSubject.getClass().getInterfaces(), handler);
		subjectProxy.operate();
	}
}
