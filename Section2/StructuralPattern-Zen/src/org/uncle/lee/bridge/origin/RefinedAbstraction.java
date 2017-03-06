package org.uncle.lee.bridge.origin;

import org.uncle.lee.utils.LogUtils;

public class RefinedAbstraction extends Abstraction {
	private static final String TAG = RefinedAbstraction.class.getSimpleName();

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void operate() {
		doBefore();
		super.operate();
		doAfter();
	}

	private void doBefore() {
		LogUtils.d(TAG, "doBefore");
	}

	private void doAfter() {
		LogUtils.d(TAG, "doAfter");
	}

}
