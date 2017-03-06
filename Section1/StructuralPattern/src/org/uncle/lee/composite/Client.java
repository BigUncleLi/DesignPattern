package org.uncle.lee.composite;

public class Client {
	public static void main(String[] args) {
		Component root = new Composite("root");
		
		Component twoLevelCompositeA = new Composite("twoLevelCompositeA");
		Component twoLevelCompositeB = new Composite("twoLevelCompositeB");
		addChildren(root, twoLevelCompositeA, twoLevelCompositeB);
		
		Component threeLevelLeaf = new Leaf("threeLevelLeaf");
		Component threeLevelComposite = new Composite("threeLevelComposite");
		addChildren(twoLevelCompositeB, threeLevelLeaf, threeLevelComposite);
		
		Component fourLevelLeafA = new Composite("fourLevelLeafA");
		Component fourLevelLeafB = new Composite("fourLevelLeafB");
		addChildren(threeLevelComposite, fourLevelLeafA, fourLevelLeafB);
		
		root.showStucture();
	}
	
	public static void addChildren(Component root, Component... children){
		for(Component child : children){
			boolean isSuccess = root.add(child);
			judgeSuccess(root, child, isSuccess);
		}
	}

	private static void judgeSuccess(Component root, Component child, boolean isSuccess) {
		if(!isSuccess){
			throw new RuntimeException(root.getName() + " addChild " + child.getName() + " error");
		}
	}
}
