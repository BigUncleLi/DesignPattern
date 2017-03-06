package org.uncle.lee.singleton.expand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.uncle.lee.utils.LogUtils;

public class Emperor {
	private static final String TAG = Emperor.class.getSimpleName();
	private static final int MAX_EMPEROR_NUMBER = 3;
	private static int currentEmperorIndex = 0;
	
	private static List<Emperor> emperorList = new ArrayList<Emperor>();
	private static List<String> emperorNameList = new ArrayList<String>();
	
	static{
		for(int i = 0; i < MAX_EMPEROR_NUMBER; i++){
			emperorList.add(new Emperor("Emperor" + i));
		}
	}
	
	private Emperor(){}
	
	private Emperor(String name){
		emperorNameList.add(name);
	}
	
	public static Emperor getInstance(){
		Random random = new Random();
		currentEmperorIndex = random.nextInt(MAX_EMPEROR_NUMBER);
		return emperorList.get(currentEmperorIndex);
	}
	
	public void say(){
		LogUtils.d(TAG, "I'm emperor num-" + currentEmperorIndex);
	}
}
