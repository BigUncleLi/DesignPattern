
package org.uncle.lee.factory.method.expand.multiple;

import org.uncle.lee.factory.method.Human;
import org.uncle.lee.factory.method.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}
}
