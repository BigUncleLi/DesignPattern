package org.uncle.lee.iterator;

public interface Iterator <E>{
	public abstract E first();
	public abstract E next();
	public abstract boolean hasNext();
	public abstract E currentItem();
}
