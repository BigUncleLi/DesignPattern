package org.uncle.lee.factory.simple;

public class Factory {
	public static final int CONCRETE_PRODUCT_1 = 90000;
	public static final int CONCRETE_PRODUCT_2 = 91000;
	
	public Product createProductBaseOnType(int productType){
		Product product = null;
		switch(productType){
			case CONCRETE_PRODUCT_1:
				product = new ConcreteProduct1();
				break;
			case CONCRETE_PRODUCT_2:
				product = new ConcreteProduct2();
				break;
		}
		return product;
	}
}
