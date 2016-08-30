package org.uncle.lee.flyweight.demo;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "SignInfo-Client";
	private static final String TAG_A = "a";
	private static final String TAG_B = "b";
	
	public static void main(String[] args) {
		SignInfoFactory signInfoFactory = new SignInfoFactory();
		
		testInstanceA(signInfoFactory);
		testInstanceB(signInfoFactory);
		testInstanceA(signInfoFactory);
	}

	private static void testInstanceA(SignInfoFactory signInfoFactory) {
		SignInfo signInfoA = signInfoFactory.getSignInfo(TAG_A);
		show(signInfoA);
	}
	
	private static void show(SignInfo signInfo) {
		LogUtils.d(TAG, "show : " + signInfo.toString());
	}

	private static void testInstanceB(SignInfoFactory signInfoFactory) {
		SignInfo signInfoB = signInfoFactory.getSignInfo(TAG_B);
		show(signInfoB);
	}
}
