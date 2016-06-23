package org.uncle.lee.facade;

import org.uncle.lee.utils.LogUtils;

public class SubSystemC {
	private static final String TAG = SubSystemC.class.getSimpleName();
	
	public void operate(){
		LogUtils.d(TAG, "operate");
	}
}
