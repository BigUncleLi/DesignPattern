package org.uncle.lee.builder;

public class Director {
	public void constructABenz(CarBuilder aBenzBuilder){
		aBenzBuilder.start();
		aBenzBuilder.stop();
	}
	
	public void constructBBenz(CarBuilder bBenzBuilder){
		bBenzBuilder.engineBoom();
		bBenzBuilder.start();
		bBenzBuilder.stop();
	}
	
	public void constructABmw(CarBuilder aBmwBuilder){
		aBmwBuilder.alarm();
		aBmwBuilder.start();
		aBmwBuilder.stop();
	}
	
	public void constructBBmw(CarBuilder bBmwBuilder){
		bBmwBuilder.start();
	}
}
