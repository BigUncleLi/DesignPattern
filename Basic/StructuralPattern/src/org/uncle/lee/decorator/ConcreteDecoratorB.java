
package org.uncle.lee.decorator;

import org.uncle.lee.utils.LogUtils;

public class ConcreteDecoratorB extends Decorator {
	private static final String TAG = ConcreteDecoratorB.class.getSimpleName();

	public ConcreteDecoratorB(Component concreteComponent) {
		super(concreteComponent);
	}

	@Override
	public void doBefore() {
		LogUtils.d(TAG, "do something before operator");
	}

	@Override
	public void doAfter() {
		LogUtils.d(TAG, "do something after operator");
	}
}
