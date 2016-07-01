package org.uncle.lee.factory.method.expand.pool;

import org.uncle.lee.utils.LogUtils;

public class Product {
	private String name;

	public Product(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public void show(){
		LogUtils.d(this.getClass().getSimpleName(), name);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
}
