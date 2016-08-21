package org.uncle.lee.strategy.demo.my;

import org.uncle.lee.strategy.demo.AmapService;
import org.uncle.lee.strategy.demo.BaiduMapService;
import org.uncle.lee.strategy.demo.MapService;

public class Client {
	public static void main(String[] args) {
		MapService amapService = createAmapService();
		testMapService(amapService);
		
		MapService baiduMapService = createBaiduMapService();
		testMapService(baiduMapService);
	}

	private static MapService createAmapService() {
		return new AmapService();
		
	}
	
	private static MapService createBaiduMapService() {
		return new BaiduMapService();
	}
	
	private static void testMapService(MapService mapService) {
		mapService.locate();
		mapService.getPois();
		mapService.startNavi();
		mapService.otherFunction();
	}

}
