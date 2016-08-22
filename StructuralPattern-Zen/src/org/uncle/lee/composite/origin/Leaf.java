package org.uncle.lee.composite.origin;

import java.util.List;

import org.uncle.lee.utils.LogUtils;

public class Leaf implements Component{
	private static final String TAG = Leaf.class.getSimpleName();
	private String name;
	
	public Leaf(String name){
		this.name = name;
	}

	@Override
	public void operate() {
		LogUtils.d(TAG, "operate ...");
	}

	@Override
	public void addChild(Component component) {}

	@Override
	public void remove(Component component) {}

	@Override
	public List<Component> getChildren() {
		return null;
	}

	@Override
	public String toString() {
		return "Leaf [name=" + name + "]";
	}
}
