package org.uncle.lee.proxy.dynamic;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy{
	public static <T> T newProxyInstance(Object subject){
		ClassLoader loader = subject.getClass().getClassLoader();
		Class<?>[] interfaces = subject.getClass().getInterfaces();
		InvocationHandler handler = new MyInvocationHandler(subject);
		return DynamicProxy.newProxyInstance(loader, interfaces, handler);
	}
}
