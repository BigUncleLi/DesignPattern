package org.uncle.lee.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.uncle.lee.utils.LogUtils;

public class MyInvocationHandler implements InvocationHandler {
	private static final String TAG = MyInvocationHandler.class.getSimpleName();

	private Object obj;

	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		doBefore();
		Object result = method.invoke(obj, args);
		doAfter();
		return result;
	}

	private void doBefore() {
		LogUtils.d(TAG, "do something before ...");
	}

	private void doAfter() {
		LogUtils.d(TAG, "do something after ...");
	}
}
