package org.uncle.lee.builder;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "builder";
	
	public static void main(String[] args) {
		Builder builder1 = new ConcreteBuilder1();
		Director director = new Director();
		
		director.construct(builder1);
		Product product = builder1.getProduct();
		
		LogUtils.d(TAG, product.toString());
	}
}
