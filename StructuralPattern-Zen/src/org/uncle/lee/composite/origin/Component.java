package org.uncle.lee.composite.origin;

import java.util.List;

public interface Component {
	public abstract void operate();
	public abstract void addChild(Component component);
	public abstract void remove(Component component);
	public abstract List<Component> getChildren();
}
