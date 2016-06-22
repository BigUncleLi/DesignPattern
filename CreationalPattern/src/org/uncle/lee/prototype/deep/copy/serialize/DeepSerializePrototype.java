package org.uncle.lee.prototype.deep.copy.serialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class DeepSerializePrototype implements Cloneable, Serializable{
	public class InnerObject implements Serializable{}
	
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
	protected DeepSerializePrototype clone() throws CloneNotSupportedException {
		DeepSerializePrototype deepSerializePrototype = getDeepSerializePrototypeCatchException();
		return deepSerializePrototype;
	}

	private DeepSerializePrototype getDeepSerializePrototypeCatchException(){
		ByteArrayOutputStream bo = null;
		DeepSerializePrototype deepSerializePrototype = null;
		try {
			bo = writeIntoStream(this);
			deepSerializePrototype = readFormStream(bo);
			return deepSerializePrototype;
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e.toString());
		}
	}
	
	private ByteArrayOutputStream writeIntoStream(DeepSerializePrototype deepSerializePrototype) throws IOException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(deepSerializePrototype);
		return bo;
	}
	
	private DeepSerializePrototype readFormStream(ByteArrayOutputStream bo) throws IOException, ClassNotFoundException {
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (DeepSerializePrototype) oi.readObject();
	}
}
