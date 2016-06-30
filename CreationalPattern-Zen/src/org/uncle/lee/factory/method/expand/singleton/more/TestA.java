package org.uncle.lee.factory.method.expand.singleton.more;

import org.uncle.lee.utils.LogUtils;

public class TestA {
	private static final String TAG = TestA.class.getSimpleName();
	
	private TestA(){}
	
	public void show(){
		LogUtils.d(TAG, "test a : " + this.hashCode());
	}
}
