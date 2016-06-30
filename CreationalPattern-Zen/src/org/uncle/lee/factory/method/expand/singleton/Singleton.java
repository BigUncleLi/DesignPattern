package org.uncle.lee.factory.method.expand.singleton;

import org.uncle.lee.utils.LogUtils;

public class Singleton {
	private static final String TAG = Singleton.class.getSimpleName();
	
	private Singleton(){}
	
	public void showInstance(){
		LogUtils.d(TAG, "show instance : " + this.hashCode());
	}
}
