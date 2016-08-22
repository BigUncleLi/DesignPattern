package org.uncle.lee.composite.origin;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "composite client";
	
	public static void main(String[] args) {
		Component chairman = new Composite("Chairman");

		Composite ceo = new Composite("CEO");
		chairman.addChild(ceo);
		Leaf vp = new Leaf("VP");
		ceo.addChild(vp);

		Composite coo = new Composite("COO");
		chairman.addChild(coo);

		showCompnent(chairman);
	}

	private static void showCompnent(Component chairman) {
		if (chairman instanceof Composite) {
			printItslef(chairman);
			printChildren((Composite) chairman);
		} else {
			printItslef(chairman);
		}
	}

	private static void printItslef(Component chairman) {
		LogUtils.d(TAG, chairman.toString());
	}
	
	private static void printChildren(Composite chairman) {
		for(Component item : chairman.getChildren()){
			showCompnent(item);
		}
	}
}
