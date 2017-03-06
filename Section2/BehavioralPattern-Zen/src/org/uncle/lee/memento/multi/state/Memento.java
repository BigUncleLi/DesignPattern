package org.uncle.lee.memento.multi.state;

import java.util.Map;

public class Memento {
	private Map<String, Object> prop;

	public Memento(Map<String, Object> prop){
		this.prop = prop;
	}
	
	public Map<String, Object> getProp() {
		return prop;
	}

	public void setProp(Map<String, Object> prop) {
		this.prop = prop;
	}

}
