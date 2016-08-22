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

	@Deprecated
	@Override
	public void addChild(Component component) {
		throw new UnsupportedOperationException();
	}

	@Deprecated
	@Override
	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}

	@Deprecated
	@Override
	public List<Component> getChildren() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Leaf [name=" + name + "]";
	}
}
