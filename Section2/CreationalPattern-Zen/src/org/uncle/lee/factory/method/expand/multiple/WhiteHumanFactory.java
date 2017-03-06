package org.uncle.lee.factory.method.expand.multiple;

import org.uncle.lee.factory.method.Human;
import org.uncle.lee.factory.method.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {
	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}
}
