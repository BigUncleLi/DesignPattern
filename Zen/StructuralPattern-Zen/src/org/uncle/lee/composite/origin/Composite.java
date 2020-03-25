package org.uncle.lee.composite.origin;

import java.util.ArrayList;
import java.util.List;

import org.uncle.lee.utils.LogUtils;

public class Composite implements Component {
	private static final String TAG = Composite.class.getSimpleName();
	private String name;
	private List<Component> componentChildren;
	
	public Composite(String name){
		this.name = name;
		componentChildren = new ArrayList<Component>();
	}

	@Override
	public void operate() {
		LogUtils.d(TAG, "operate ...");
	}

	@Override
	public void addChild(Component component) {
		componentChildren.add(component);
	}

	@Override
	public void remove(Component component) {
		componentChildren.remove(component);
	}

	@Override
	public List<Component> getChildren() {
		return componentChildren;
	}

	@Override
	public String toString() {
		return "Composite [name=" + name + "]";
	}
}
