package org.uncle.lee.strategy.demo.enums;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "CalculateClient";
	
	public static void main(String[] args) {
		int addResult = IntCalculate.add.execute(1, 2);
		LogUtils.d(TAG, "addResult : " + addResult);
	}
}
