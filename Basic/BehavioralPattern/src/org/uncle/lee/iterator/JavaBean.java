package org.uncle.lee.iterator;

import org.uncle.lee.utils.LogUtils;

public class JavaBean {
	private static final String TAG = JavaBean.class.getSimpleName();
	private String name;
	
	public JavaBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "JavaBean [name=" + name + "]";
	}
	
	public void display(){
		LogUtils.d(TAG, this.toString());
	}
}
