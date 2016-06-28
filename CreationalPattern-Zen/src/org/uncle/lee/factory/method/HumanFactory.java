
package org.uncle.lee.factory.method;

import org.uncle.lee.utils.LogUtils;

public class HumanFactory extends AbstractHumanFactory {
	private static final String TAG = HumanFactory.class.getSimpleName();

	@SuppressWarnings({ "unchecked" })
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			LogUtils.d(TAG, "create human error : " + e.toString());
		}
		return (T) human;
	}
}
