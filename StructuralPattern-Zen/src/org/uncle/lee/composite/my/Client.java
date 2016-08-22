package org.uncle.lee.composite.my;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "composite client";
	
	public static void main(String[] args) {
		Node rootNode = new ConcreteNode("root node");
		
		ConcreteNode cNode = new ConcreteNode("C");
		rootNode.addChild(cNode);
		ConcreteNode file2 = new ConcreteNode("file2");
		rootNode.addChild(file2);
		
		ConcreteNode file1 = new ConcreteNode("file1");
		cNode.addChild(file1);
		
		show(rootNode);
	}

	private static void show(Node rootNode) {
		if(hasChildren(rootNode)){
			printItself(rootNode);
			printChildren(rootNode);
		}else {
			printItself(rootNode);
		}
	}
	
	private static boolean hasChildren(Node rootNode) {
		return rootNode.getChildren().size() > 0;
	}

	private static void printItself(Node rootNode) {
		printNode(rootNode);
	}

	private static void printChildren(Node rootNode) {
		for(Node node : rootNode.getChildren()){
			show(node);
		}
	}

	private static void printNode(Node rootNode) {
		LogUtils.d(TAG, "node : " + rootNode.toString());
	}
}
