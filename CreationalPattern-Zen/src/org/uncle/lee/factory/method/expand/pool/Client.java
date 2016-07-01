package org.uncle.lee.factory.method.expand.pool;

public class Client {
	public static void main(String[] args) {
		
		setMaxSizeFirstly();
		setMaxSizeAfterCreate();
	}

	private static void setMaxSizeFirstly() {
		ProductFactory factory = new ProductFactory(3);
		
		createFourProduct(factory);
	}
	
	private static void setMaxSizeAfterCreate() {
		ProductFactory factory = new ProductFactory();
		
		createFourProduct(factory);
		
		factory.setMaxSize(3);
	}
	
	private static void createFourProduct(ProductFactory factory) {
		factory.createProduct("product0").show();
		factory.createProduct("product1").show();
		factory.createProduct("product2").show();
		factory.createProduct("product3").show();
	}
}