package org.uncle.lee.factory.method;

public class Client {
	public static void main(String[] args) {
		AbstractHumanFactory humanFactory = new HumanFactory();
		showHumanTalk(humanFactory, BlackHuman.class);
		showHumanTalk(humanFactory, WhiteHuman.class);
		showHumanTalk(humanFactory, YellowHuman.class);
	}

	private static <T extends Human> void showHumanTalk(AbstractHumanFactory humanFactory, Class<T> c) {
		T createHuman = humanFactory.createHuman(c);
		createHuman.talk();
	}
}
