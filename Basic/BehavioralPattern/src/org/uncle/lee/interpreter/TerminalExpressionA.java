package org.uncle.lee.interpreter;

import org.uncle.lee.utils.LogUtils;

public class TerminalExpressionA implements Expression {
	private static final String TAG = TerminalExpressionA.class.getSimpleName();

	@Override
	public void interpret(Context context) {
		String input = getContextInput(context);
		String result = handleInput(input);
		setContextOutput(context, result);
	}

	private String getContextInput(Context context) {
		return context.getInput();
	}
	
	private String handleInput(String input) {
		LogUtils.d(TAG, "handle input : " + input);
		input += "-terminal expressiona handle";
		return input;
	}
	
	private void setContextOutput(Context context, String result) {
		context.setOutput(result);
	}
}
