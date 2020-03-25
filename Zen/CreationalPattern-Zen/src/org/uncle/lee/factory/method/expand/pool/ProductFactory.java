package org.uncle.lee.factory.method.expand.pool;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

import org.uncle.lee.utils.LogUtils;

public class ProductFactory {
	private static final String TAG = ProductFactory.class.getSimpleName();
	private static final int DEFAULT_MAX_SIZE = 10;
	private static final int ONE_TIME = 1;
	
	private Queue<Product> productQueue;
	private int maxSize = DEFAULT_MAX_SIZE;

	public ProductFactory(){
		productQueue = new LinkedBlockingDeque<Product>();
	}
	
	public ProductFactory(int maxSize) {
		this();
		setMaxSize(maxSize);
	}

	public void setMaxSize(int maxSize) {
		if(length() > maxSize){
			productQueuePollElement(length() - maxSize);
		}
		this.maxSize = maxSize;
	}

	
	private void productQueuePollElement(int time) {
		for(int i = 0; i < time; i++){
			Product product = productQueue.poll();
			LogUtils.d(TAG, "Element-" + product.toString() + " poll. Current size is : " + length());
		}
	}

	private int length() {
		return productQueue.size();
	}

	public int getMaxSize() {
		return maxSize;
	}

	public Product createProduct(String name){
		if(!isProductExistByName(name)){
			judgeMaxLength();
			return createProductByName(name);
		}else{
			return searchProductByName(name);
		}
	}
	
	private boolean isProductExistByName(String name) {
		for(Product product : productQueue){
			if(product.getname().equals(name)){
				return true;
			}
		}
		return false;
	}

	private void judgeMaxLength() {
		if(length() == maxSize){
			productQueuePollElement(ONE_TIME);
		}
	}

	private Product createProductByName(String name) {
		Product product = new Product(name);
		productQueue.offer(product);
		LogUtils.d(TAG, "Element-" + product.toString() + " offer. Current size is : " + length());
		return product;
	}

	private Product searchProductByName(String name) {
		for(Product product : productQueue){
			if(product.getname().equals(name)){
				return product;
			}
		}
		return null;
	}
}
