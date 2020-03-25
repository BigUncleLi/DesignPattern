package org.uncle.lee.builder;

public class ConcreteBuilder2 implements Builder {
	private Product product = new Product();
	
	@Override
	public void setFeatureA() {
		product.setFeatureA("a2");
	}

	@Override
	public void setFeatureB() {
		product.setFeatureB("b2");
	}

	@Override
	public void setFeatureC() {
		product.setFeatureC("c2");
	}

	@Override
	public Product getProduct() {
		return product;
	}
}
