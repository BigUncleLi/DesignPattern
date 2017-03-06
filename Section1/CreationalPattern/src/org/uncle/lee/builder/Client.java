package org.uncle.lee.builder;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "builder";
	
	public static void main(String[] args) {
		Director director = new Director();
		
		Product product1 = createProduct1(director);
		showProduct(product1);
		
		Product product2 = createProduct2(director);
		showProduct(product2);
	}

	private static Product createProduct1(Director director) {
		Builder builder1 = new ConcreteBuilder1();
		director.construct(builder1);
		return builder1.getProduct();
	}
	
	private static Product createProduct2(Director director) {
		Builder builder2 = new ConcreteBuilder2();
		director.construct(builder2);
		return builder2.getProduct();
	}
	
	private static void showProduct(Product product) {
		LogUtils.d(TAG, product.toString());
	}
}
