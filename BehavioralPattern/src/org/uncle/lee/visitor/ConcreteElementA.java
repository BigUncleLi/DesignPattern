package org.uncle.lee.visitor;

public class ConcreteElementA implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visitA();
	}
}
