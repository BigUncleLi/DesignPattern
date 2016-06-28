package org.uncle.lee.singleton;

public class Minister {
	private static final int MAX_DAY = 3;
	
	public static void main(String[] args) {
		seeEmperor(MAX_DAY);
	}

	private static void seeEmperor(int maxDay) {
		for(int i = 0; i < maxDay; i++){
			Emperor.getInstance().say();
		}
	}
}
