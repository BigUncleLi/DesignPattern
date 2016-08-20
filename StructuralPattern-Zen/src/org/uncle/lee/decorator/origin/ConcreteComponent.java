package org.uncle.lee.decorator.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteComponent implements Component {
	private static final String TAG = ConcreteComponent.class.getSimpleName();
	
	@Override
	public void operation() {
		LogUtils.d(TAG, "real operation");
	}
}
