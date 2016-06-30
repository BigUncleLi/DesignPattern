package org.uncle.lee.factory.method.expand.singleton.more;

import org.uncle.lee.utils.LogUtils;

public class TestB {
	private static final String TAG = TestB.class.getSimpleName();
	
	private TestB(){}
	
	public void show(){
		LogUtils.d(TAG, "test b : " + this.hashCode());
	}
}
