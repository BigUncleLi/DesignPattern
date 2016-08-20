package org.uncle.lee.decorator.demo.inherit;

import org.uncle.lee.utils.LogUtils;

public class F21MyReport extends MyReport {
	private static final String TAG = F21MyReport.class.getSimpleName();
	
	@Override
	public void show() {
		LogUtils.d(TAG, "f2 function improvement");
		LogUtils.d(TAG, "f1 function improvement");
		super.show();
	}

}
