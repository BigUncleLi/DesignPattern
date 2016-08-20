package org.uncle.lee.decorator.origin;

import org.uncle.lee.utils.LogUtils;


public class ConcreteDecoratorA extends Decorator {
	private static final String TAG = ConcreteDecoratorA.class.getSimpleName();

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		aImprove();
		super.component.operation();
	}

	private void aImprove() {
		LogUtils.d(TAG, "a function improvement");
	}
}
