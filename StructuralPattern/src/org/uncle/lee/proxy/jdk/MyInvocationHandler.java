package org.uncle.lee.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.uncle.lee.utils.LogUtils;

public class MyInvocationHandler implements InvocationHandler{
	private static final String TAG = MyInvocationHandler.class.getSimpleName();
	private Subject realSubject;
	
	public MyInvocationHandler(Subject realSubject){
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		doBefore();
		Object result = method.invoke(realSubject, args);
		doAfter();
		return result;
	}

	private void doBefore() {
		LogUtils.d(TAG, "do something before operator");
	}
	
	private void doAfter() {
		LogUtils.d(TAG, "do something after operator");
	}
}
