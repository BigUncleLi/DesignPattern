package org.uncle.lee.adapter;

import org.uncle.lee.utils.LogUtils;

public class Adaptee {
	private static final String TAG = Adaptee.class.getSimpleName();
	
	public void specificRequest(){
		LogUtils.d(TAG, "specificRequest");
	}
}
