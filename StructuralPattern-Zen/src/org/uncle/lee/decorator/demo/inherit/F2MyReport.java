package org.uncle.lee.decorator.demo.inherit;

import org.uncle.lee.decorator.demo.MyReport;
import org.uncle.lee.utils.LogUtils;

public class F2MyReport extends MyReport {
	private static final String TAG = F2MyReport.class.getSimpleName();
	
	@Override
	public void show() {
		LogUtils.d(TAG, "f2 function improvement");
		super.show();
	}

}
