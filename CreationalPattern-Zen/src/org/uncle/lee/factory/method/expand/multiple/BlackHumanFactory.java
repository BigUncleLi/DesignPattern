
package org.uncle.lee.factory.method.expand.multiple;

import org.uncle.lee.factory.method.BlackHuman;
import org.uncle.lee.factory.method.Human;

public class BlackHumanFactory extends AbstractHumanFactory {
	@Override
	public Human createHuman() {
		return new BlackHuman();
	}
}
