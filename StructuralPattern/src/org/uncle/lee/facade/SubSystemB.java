package org.uncle.lee.facade;

import org.uncle.lee.utils.LogUtils;

public class SubSystemB {
	private static final String TAG = SubSystemB.class.getSimpleName();
	
	public void operate(){
		LogUtils.d(TAG, "operate");
	}
}
