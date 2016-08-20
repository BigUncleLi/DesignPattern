package org.uncle.lee.decorator.demo.decorator;

import org.uncle.lee.decorator.demo.SchoolReport;
import org.uncle.lee.utils.LogUtils;

public class F1Decorator extends Decorator {
	private static final String TAG = F1Decorator.class.getSimpleName();

	public F1Decorator(SchoolReport myReport) {
		super(myReport);
	}

	@Override
	public void show() {
		f1FunctionImporve();
		super.myReport.show();
	}

	private void f1FunctionImporve() {
		LogUtils.d(TAG, "f1 function improvement");
	}
}
