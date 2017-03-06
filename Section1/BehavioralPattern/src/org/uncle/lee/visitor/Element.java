package org.uncle.lee.visitor;

public interface Element {
	public abstract void accept(Visitor visitor);
}
