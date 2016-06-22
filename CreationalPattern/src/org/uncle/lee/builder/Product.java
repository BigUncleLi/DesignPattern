package org.uncle.lee.builder;

public class Product {
	private String featureA;
	private String featureB;
	private String featureC;
	
	public String getFeatureA() {
		return featureA;
	}
	
	public void setFeatureA(String featureA) {
		this.featureA = featureA;
	}
	
	public String getFeatureB() {
		return featureB;
	}
	
	public void setFeatureB(String featureB) {
		this.featureB = featureB;
	}
	
	public String getFeatureC() {
		return featureC;
	}
	
	public void setFeatureC(String featureC) {
		this.featureC = featureC;
	}
	
	@Override
	public String toString() {
		return "Product [featureA=" + featureA + ", featureB=" + featureB
				+ ", featureC=" + featureC + "]";
	}
}
