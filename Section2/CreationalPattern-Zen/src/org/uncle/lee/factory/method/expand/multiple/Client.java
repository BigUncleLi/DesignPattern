package org.uncle.lee.factory.method.expand.multiple;

public class Client {
	public static void main(String[] args) {
		showHumanTalk(new BlackHumanFactory());
		showHumanTalk(new WhiteHumanFactory());
		showHumanTalk(new YellowHumanFactory());
	}

	private static void showHumanTalk(AbstractHumanFactory humanFactory) {
		humanFactory.createHuman().talk();
	}
}
