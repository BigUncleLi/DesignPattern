package org.uncle.lee.interpreter;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "InterpreterPatternClient";
	
	public static void main(String[] args) {
		Context context = new Context("input");
		Expression expressionA = new TerminalExpressionA();
		expressionA.interpret(context);
		LogUtils.d(TAG, "output after handle is : " + context.getOutput());
	}
}
