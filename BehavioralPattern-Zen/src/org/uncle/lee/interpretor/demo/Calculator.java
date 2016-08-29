package org.uncle.lee.interpretor.demo;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {
	private Expression expression;

	public Calculator(String expStr){
		Stack<Expression> stack = new Stack<Expression>();
		
		char[] expArray = expStr.toCharArray();
		
		Expression left;
		Expression right;
		for(int i = 0; i < expArray.length; i++){
			switch(expArray[i]){
				case '+':
					left = stack.pop();
					right = new VarExpression(String.valueOf(expArray[++i]));
					stack.push(new AddExpression(left, right));
					break;
				case '-':
					left = stack.pop();
					right = new VarExpression(String.valueOf(expArray[++i]));
					stack.push(new SubExpression(left, right));
					break;
				default:
					stack.push(new VarExpression(String.valueOf(expArray[i++])));
					break;
			}
		}
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		return this.expression.interpreter(var);
	}

}
