package org.uncle.lee.singleton.expand;

public class Minister {
	private static int MAX_NUMBER_MINISTER = 5;
	
	public static void main(String[] args) {
		for(int i = 0; i < MAX_NUMBER_MINISTER; i++){
			seeEmperor();
		}
	}

	private static void seeEmperor() {
		Emperor.getInstance().say();
	}
}
