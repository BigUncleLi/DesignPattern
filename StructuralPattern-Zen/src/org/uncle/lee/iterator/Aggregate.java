package org.uncle.lee.iterator;

public interface Aggregate <E>{
	public abstract boolean add(E e);
	public abstract boolean remove(E e);
	public abstract Iterator<E> iterator();
}
