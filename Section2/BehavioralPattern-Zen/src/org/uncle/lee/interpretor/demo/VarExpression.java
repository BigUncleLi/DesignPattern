package org.uncle.lee.interpretor.demo;

import java.util.HashMap;

public class VarExpression implements Expression {
	private String key;
	
	public VarExpression(String key){
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
