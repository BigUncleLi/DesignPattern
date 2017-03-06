package org.uncle.lee.factory.abs;

import org.uncle.lee.utils.LogUtils;

public class ConcreteYelloMan extends AbstractYellowHuman {
	@Override
	public void talk() {
		LogUtils.d(this.getClass().getSimpleName(), "I'm a yellow man.");
	}
}
