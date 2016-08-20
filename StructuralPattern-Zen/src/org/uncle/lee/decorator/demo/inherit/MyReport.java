package org.uncle.lee.decorator.demo.inherit;

import org.uncle.lee.utils.LogUtils;

public class MyReport implements SchoolReport {
	private static final String TAG = MyReport.class.getSimpleName();
	
	@Override
	public void show() {
		LogUtils.d(TAG, "My score is : 80");
	}
}
