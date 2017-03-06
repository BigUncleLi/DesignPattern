package org.uncle.lee.factory.simple;

import java.util.NoSuchElementException;

public class Factory {
	public static final int PRODUCT_TYPE_1 = 90000;
	public static final int PRODUCT_TYPE_2 = 91000;
	
	public Product createProductByType(int productType){
		Product product = null;
		switch(productType){
			case PRODUCT_TYPE_1:
				product = new ConcreteProduct1();
				break;
			case PRODUCT_TYPE_2:
				product = new ConcreteProduct2();
				break;
			default:
				throw new NoSuchElementException("product type " + productType);
		}
		return product;
	}
}
