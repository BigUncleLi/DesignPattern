package org.uncle.lee.visitor;

import org.uncle.lee.utils.LogUtils;

public class ConcreteVisitor implements Visitor {
	private static final String TAG = ConcreteVisitor.class.getSimpleName();
	
	@Override
	public void visitA() {
		LogUtils.d(TAG, "visit a");
	}

	@Override
	public void visitB() {
		LogUtils.d(TAG, "visit b");
	}

	@Override
	public void visit() {
		LogUtils.d(TAG, "visit");
	}
}
