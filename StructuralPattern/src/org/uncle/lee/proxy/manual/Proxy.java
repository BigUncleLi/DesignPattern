package org.uncle.lee.proxy.manual;

import org.uncle.lee.utils.LogUtils;

public class Proxy implements Subject {
	private static final String TAG = Proxy.class.getSimpleName();
	
	private Subject realSubject;
	
	public Proxy(Subject realSubject){
		this.realSubject = realSubject;
	}

	@Override
	public void operate() {
		doBefore();
		realSubject.operate();
		doAfter();
	}
	
	private void doBefore() {
		LogUtils.d(TAG, "do something before operator");
	}
	
	private void doAfter() {
		LogUtils.d(TAG, "do something after operator");
	}
}
