package org.uncle.lee.strategy.demo.context;

import org.uncle.lee.strategy.demo.AmapService;
import org.uncle.lee.strategy.demo.BaiduMapService;

public class Client {
	public static void main(String[] args) {
		testAmapService();
		testBaiduService();
	}

	private static void testAmapService() {
		MapContext amapContext = new MapContext(new AmapService());
		amapContext.operate();
	}
	
	private static void testBaiduService() {
		MapContext baiduContext = new MapContext(new BaiduMapService());
		baiduContext.operate();
	}
}
