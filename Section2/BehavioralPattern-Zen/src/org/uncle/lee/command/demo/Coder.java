package org.uncle.lee.command.demo;

import org.uncle.lee.utils.LogUtils;

public class Coder implements Group{
	private static final String TAG = Coder.class.getSimpleName();
	
	@Override
	public void find(String msg) {
		LogUtils.d(TAG, "find" + msg);
	}

	@Override
	public void add(String msg) {
		LogUtils.d(TAG, "add" + msg);
	}

	@Override
	public void delete(String msg) {
		LogUtils.d(TAG, "delete" + msg);
	}

	@Override
	public void change(String msg) {
		LogUtils.d(TAG, "change" + msg);
	}

	@Override
	public void plan(String msg) {
		LogUtils.d(TAG, "plan" + msg);
	}

}
