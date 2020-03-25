package org.uncle.lee.template.method;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "TemplateMethodClient";
	
	public static void main(String[] args) {
		AbstractClass abstractClass = new AbstractClass(){
			@Override
			public void method1() {
				LogUtils.d(TAG, "method1");
			}

			@Override
			public void method2() {
				LogUtils.d(TAG, "method2");
			}};
			
		abstractClass.execute();
	}
}
