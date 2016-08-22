package org.uncle.lee.iterator;

import java.util.List;

public class ConcreteIterator<E> implements Iterator<E> {
	private static final int FIRST_INDEX = 0;
	
	private List<E> items;
	private int index = 0;
	
	public ConcreteIterator(List<E> items) {
		this.items = items;
	}

	@Override
	public E first() {
		return items.get(FIRST_INDEX);
	}

	@Override
	public E next() {
		return items.get(index++);
	}

	@Override
	public boolean hasNext() {
		return (index + 1) <= items.size();
	}

	@Override
	public E currentItem() {
		return items.get(index);
	}

}
