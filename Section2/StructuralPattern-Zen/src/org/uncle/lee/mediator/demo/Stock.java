package org.uncle.lee.mediator.demo;

import org.uncle.lee.utils.LogUtils;

public class Stock {
	private static final String TAG = Stock.class.getSimpleName();
	private int stockNumber;
	
	public synchronized void deleteStockNumber(int deleteNumber){
		LogUtils.d(TAG, "origin stock number : " + stockNumber + ", deleteStockNumber : " + deleteNumber);
		stockNumber -= deleteNumber;
		LogUtils.d(TAG, "current stock number : " + stockNumber);
	}
	
	public synchronized void addStockNumber(int addNumber){
		LogUtils.d(TAG, "origin stock number : " + stockNumber + ", addStockNumber : " + addNumber);
		stockNumber += addNumber;
		LogUtils.d(TAG, "current stock number : " + stockNumber);
	}
	
	public int queryStockNumber(){
		return stockNumber;
	}
}
