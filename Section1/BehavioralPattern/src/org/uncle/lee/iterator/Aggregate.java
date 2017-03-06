package org.uncle.lee.iterator;

import java.util.Collection;
import java.util.Iterator;

public interface Aggregate<E> {
	public abstract boolean add(E e);
	public abstract boolean addAll(Collection<? extends E> c);
	public abstract E get(int index);
	public abstract boolean remove(E e);
	public abstract int size();
	public abstract void clear();
	
	public abstract Iterator<E> iterator();
}
