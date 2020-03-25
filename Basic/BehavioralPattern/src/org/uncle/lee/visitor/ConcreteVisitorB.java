package org.uncle.lee.visitor;

import org.uncle.lee.utils.LogUtils;

public class ConcreteVisitorB implements Visitor {
	private static final String TAG = ConcreteVisitorB.class.getSimpleName();

	@Override
	public void visitA() {
		
	}

	@Override
	public void visitB() {
		LogUtils.d(TAG, "visit b");
	}

	@Override
	public void visit() {
		
	}
}
