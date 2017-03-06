
package org.uncle.lee.decorator.demo.decorator;

import org.uncle.lee.decorator.demo.SchoolReport;
import org.uncle.lee.utils.LogUtils;

public class F2Decorator extends Decorator {
	private static final String TAG = F2Decorator.class.getSimpleName();

	public F2Decorator(SchoolReport myReport) {
		super(myReport);
	}

	@Override
	public void show() {
		f2FunctionImprove();
		super.myReport.show();
	}

	private void f2FunctionImprove() {
		LogUtils.d(TAG, "f2 function improvement");
	}
}
