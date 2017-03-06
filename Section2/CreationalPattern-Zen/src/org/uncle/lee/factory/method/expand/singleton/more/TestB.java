package org.uncle.lee.factory.method.expand.singleton.more;

import org.uncle.lee.utils.LogUtils;

public class TestB {
	private static final String TAG = TestB.class.getSimpleName();
	private String message;
	
	private TestB(String message){
		this.message = message;
	}
	
	public void show(){
		LogUtils.d(TAG, "test b : " + this.hashCode());
		LogUtils.d(TAG, "message : " + message);
	}
}
