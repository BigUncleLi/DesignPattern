package org.uncle.lee.decorator.demo.inherit;

import org.uncle.lee.decorator.demo.MyReport;
import org.uncle.lee.utils.LogUtils;

public class F1MyReport extends MyReport {
	private static final String TAG = F1MyReport.class.getSimpleName();
	
	@Override
	public void show() {
		LogUtils.d(TAG, "f1 function improvement");
		super.show();
	}
}
