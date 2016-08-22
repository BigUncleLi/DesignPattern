package org.uncle.lee.composite.my;

import java.util.ArrayList;
import java.util.List;


public class ConcreteNode implements Node{
	private List<Node> nodes;
	private String name;
	
	public ConcreteNode(String name){
		this.name = name;
		nodes = new ArrayList<Node>();
	}

	@Override
	public boolean addChild(Node node) {
		return nodes.add(node);
	}

	@Override
	public List<Node> getChildren() {
		return nodes;
	}

	@Override
	public String toString() {
		return "ConcreteNode [name=" + name + "]";
	}
}
