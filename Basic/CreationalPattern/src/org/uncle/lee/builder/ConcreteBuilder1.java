package org.uncle.lee.builder;

public class ConcreteBuilder1 implements Builder {
	private Product product = new Product();

	@Override
	public void setFeatureA() {
		product.setFeatureA("a1");
	}

	@Override
	public void setFeatureB() {
		product.setFeatureB("b1");
	}

	@Override
	public void setFeatureC() {
		product.setFeatureC("c1");
	}

	@Override
	public Product getProduct() {
		return product;
	}
}
