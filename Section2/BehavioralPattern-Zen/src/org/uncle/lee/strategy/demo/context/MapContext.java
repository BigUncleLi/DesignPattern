package org.uncle.lee.strategy.demo.context;

import org.uncle.lee.strategy.demo.MapService;

public class MapContext {
	private MapService mapService;
	
	public MapContext(MapService mapService){
		this.mapService = mapService;
	}
	
	public void operate(){
		mapService.locate();
		mapService.getPois();
		mapService.startNavi();
		mapService.otherFunction();
	}
}
