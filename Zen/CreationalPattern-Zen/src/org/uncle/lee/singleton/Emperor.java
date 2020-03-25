package org.uncle.lee.singleton;

import org.uncle.lee.utils.LogUtils;

public class Emperor {
	private static final String TAG = Emperor.class.getSimpleName();
	private static Emperor emperor = new Emperor();
	
	private Emperor(){}
	
	public static Emperor getInstance(){
		return emperor;
	}
	
	public void say(){
		LogUtils.d(TAG, "I'm emperor num-" + emperor.hashCode());
	}
}
