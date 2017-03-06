package org.uncle.lee.memento.multi.memento;

import java.util.LinkedHashMap;
import java.util.Map;

import org.uncle.lee.memento.multi.state.Memento;

public class CareTaker {
	private static final int MAX_NUMBER = 1;
	private Map<String, Memento> mementoMap;
	
	public CareTaker(){
		mementoMap = new LinkedHashMap<String, Memento>(MAX_NUMBER, 0.75f, true) {
			private static final long serialVersionUID = 4685422045563630442L;
		};
	}
	
	public void addMemento(String name, Memento memento){
		mementoMap.put(name, memento);
	}
	
	public Memento getMemento(String name){
		return mementoMap.get(name);
	}
}
