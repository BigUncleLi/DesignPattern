package org.uncle.lee.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

public class SignInfoFactory {
	private Map<String, SignInfo> cacheSignInfo = new HashMap<String, SignInfo>();

	public SignInfoFactory() {
	}

	public SignInfo getSignInfo(String key) {
		SignInfo signInfo = null;
		
		if (cacheSignInfo.containsKey(key)) {
			signInfo = cacheSignInfo.get(key);
		} else {
			signInfo = createNewSignInfo(key);
			cacheSignInfo.put(key, signInfo);
		}
		return signInfo;
	}

	private SignInfo createNewSignInfo(String key) {
		SignInfo4Pool signInfo = new SignInfo4Pool();
		signInfo.setKey(key);
		return signInfo;
	}
}
