package org.uncle.lee.facade;

import org.uncle.lee.utils.LogUtils;

public class SubSystemA {
	private static final String TAG = SubSystemA.class.getSimpleName();
	
	public void operate(){
		LogUtils.d(TAG, "operate");
	}
}
