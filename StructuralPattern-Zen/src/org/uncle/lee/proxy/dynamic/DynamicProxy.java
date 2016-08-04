package org.uncle.lee.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy{
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(ClassLoader loader,
			Class<?>[] interfaces, InvocationHandler handler) {
		return (T) Proxy.newProxyInstance(loader, interfaces, handler);
	}
}
