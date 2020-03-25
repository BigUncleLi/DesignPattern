package org.uncle.lee.flyweight;

import java.util.HashMap;
import java.util.Map;

import org.uncle.lee.utils.LogUtils;

public class FlyweightFactory {
	private static final String TAG = FlyweightFactory.class.getSimpleName();
	private Map<String, AbstractFlyweight> flyweightPool;
	
	public FlyweightFactory(){
		flyweightPool = new HashMap<String, AbstractFlyweight>();
	}
	
	public AbstractFlyweight getFlyweight(String name){
		if(flyweightPool.containsKey(name)){
			LogUtils.d(TAG, "flyweight-" + name + " exist");
			return flyweightPool.get(name);
		}else{
			AbstractFlyweight newFlyweight = createFlyweightByName(name);
			addFlyweightIntoPool(newFlyweight);
			return newFlyweight;
		}
	}

	private AbstractFlyweight createFlyweightByName(String name) {
		LogUtils.d(TAG, "create new flyweight : " + name);
		return new Flyweight(name);
	}
	
	private void addFlyweightIntoPool(AbstractFlyweight newFlyweight) {
		flyweightPool.put(newFlyweight.getName(), newFlyweight);
	}
}
