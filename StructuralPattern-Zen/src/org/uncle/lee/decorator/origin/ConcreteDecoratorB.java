package org.uncle.lee.decorator.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteDecoratorB extends Decorator {
	private static final String TAG = ConcreteDecoratorB.class.getSimpleName();

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		bImprove();
		super.component.operation();
	}

	private void bImprove() {
		LogUtils.d(TAG, "b function improvement");
	}
}
