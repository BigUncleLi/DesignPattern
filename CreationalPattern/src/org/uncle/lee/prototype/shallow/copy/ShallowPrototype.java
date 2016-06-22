package org.uncle.lee.prototype.shallow.copy;

public class ShallowPrototype implements Cloneable{
	
	public class InnerObject{}
	
	private int value;
	private InnerObject innerObject;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public InnerObject getInnerObject() {
		return innerObject;
	}

	public void setInnerObject(InnerObject innerObject) {
		this.innerObject = innerObject;
	}

	@Override
	protected ShallowPrototype clone() throws CloneNotSupportedException {
		return (ShallowPrototype)super.clone();
	}
}
