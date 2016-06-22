package org.uncle.lee.prototype.deep.copy;

public class DeepPrototype implements Cloneable{
	public class InnerObject implements Cloneable{
		public int innerValue;
		@Override
		protected InnerObject clone() throws CloneNotSupportedException {
			return (InnerObject)super.clone();
		}
	}
	
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
	protected DeepPrototype clone() throws CloneNotSupportedException {
		DeepPrototype deepPrototype = (DeepPrototype) super.clone();
		deepPrototype.setInnerObject(innerObject.clone());
		return deepPrototype;
	}
}
