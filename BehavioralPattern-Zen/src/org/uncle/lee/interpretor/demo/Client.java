package org.uncle.lee.interpretor.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "interpretor-demo-client";
	
	public static void main(String[] args) throws IOException {
		String expStr = getExpStr();
		Map<String, Integer> expValue = getExpValue(expStr);
		Calculator calculator = new Calculator(expStr);
		LogUtils.d(TAG, "result : " + calculator.run((HashMap<String, Integer>) expValue));
	}

	private static String getExpStr() throws IOException {
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
	
	private static Map<String, Integer> getExpValue(String expStr) throws IOException {
		Map<String, Integer> var = new HashMap<String, Integer>();
		for(char ch : expStr.toCharArray()){
			if(ch != '+' && ch != '-'){
				if(!var.containsKey(String.valueOf(ch))){
					String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
					var.put(String.valueOf(ch), Integer.valueOf(in));
				}
			}
		}
		return var;
	}
}
