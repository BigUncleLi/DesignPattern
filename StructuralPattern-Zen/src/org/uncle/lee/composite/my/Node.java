package org.uncle.lee.composite.my;

import java.util.List;

public interface Node {
	public abstract boolean addChild(Node node);
	public abstract List<Node> getChildren();
}
