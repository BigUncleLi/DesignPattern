package org.uncle.lee.composite.demo;

import org.uncle.lee.utils.LogUtils;

public class LeafImpl implements Leaf {
	private static final String TAG = LeafImpl.class.getSimpleName();
	private String name;
	
	public LeafImpl(String name){
		this.name = name;
	}
	
	@Override
	public void showInfo() {
		LogUtils.d(TAG, "leaf - " + this.toString());
	}

	@Override
	public String toString() {
		return "LeafImpl [name=" + name + "]";
	}

}
