package org.uncle.lee.template.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteClass2 extends AbstractClass {
	private static final String TAG = ConcreteClass2.class.getSimpleName();

	@Override
	protected void doSomething() {
		LogUtils.d(TAG, "doSomething");
	}

	@Override
	protected void doAnything() {
		LogUtils.d(TAG, "doAnything");
	}

}
