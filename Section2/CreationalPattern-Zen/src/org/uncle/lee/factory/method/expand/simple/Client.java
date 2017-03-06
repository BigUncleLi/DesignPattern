package org.uncle.lee.factory.method.expand.simple;

import org.uncle.lee.factory.method.BlackHuman;
import org.uncle.lee.factory.method.Human;
import org.uncle.lee.factory.method.WhiteHuman;
import org.uncle.lee.factory.method.YellowHuman;

public class Client {
	public static void main(String[] args) {
		showHumanTalk(WhiteHuman.class);
		showHumanTalk(BlackHuman.class);
		showHumanTalk(YellowHuman.class);
	}

	private static <T extends Human> void showHumanTalk(Class<T> c) {
		SimpleHumanFactory.createHuman(c).talk();
	}
}
