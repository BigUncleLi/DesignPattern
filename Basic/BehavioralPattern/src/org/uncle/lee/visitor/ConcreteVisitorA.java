package org.uncle.lee.visitor;

import org.uncle.lee.utils.LogUtils;


public class ConcreteVisitorA implements Visitor{
	private static final String TAG = ConcreteVisitorA.class.getSimpleName();

	@Override
	public void visitA() {
		LogUtils.d(TAG, "visit a");
	}

	@Override
	public void visitB() {
		
	}

	@Override
	public void visit() {
		
	}
}
