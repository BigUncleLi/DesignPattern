package org.uncle.lee.facade.origin;

import org.uncle.lee.utils.LogUtils;

public class SubSystemA {
	private static final String TAG = SubSystemA.class.getSimpleName();

	public void operateA() {
		LogUtils.d(TAG, "opeateA");
	}
}
