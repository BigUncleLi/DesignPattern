package org.uncle.lee.iterator;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "iterator demo";
	
	public static void main(String[] args) {
		Aggregate<String> strings = new ConcreteAggregate<>();
		addItems(strings);
		showAggregate(strings);
	}
	
	private static void addItems(Aggregate<String> aggregate){
		aggregate.add("Hello");
		aggregate.add("my");
		aggregate.add("iterator");
		aggregate.add("pattern");
	}
	
	private static void showAggregate(Aggregate<String> aggregate){
		Iterator<String> iterator = aggregate.iterator();
		while(iterator.hasNext()){
			LogUtils.d(TAG, "item : " + iterator.next());
		}
	}
}
