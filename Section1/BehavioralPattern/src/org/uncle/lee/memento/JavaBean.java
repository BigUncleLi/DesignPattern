package org.uncle.lee.memento;

import org.uncle.lee.utils.LogUtils;

public class JavaBean {
	private static final String TAG = JavaBean.class.getSimpleName();
	
	private String name;
	private Memento memento;
	
	public JavaBean(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "JavaBean [name=" + name + "]";
	}
	
	public void display(){
		LogUtils.d(TAG, this.toString());
	}
	
	public Memento createMemento(){
		memento = new Memento(this.getName());
		return memento;
	}
	
	public void setMemento(Memento memento){
		this.setName(memento.getName());
	}
}
