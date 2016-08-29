package org.uncle.lee.interpretor.demo;

import java.util.HashMap;

public interface Expression {
	public abstract int interpreter(HashMap<String, Integer> var);
}
