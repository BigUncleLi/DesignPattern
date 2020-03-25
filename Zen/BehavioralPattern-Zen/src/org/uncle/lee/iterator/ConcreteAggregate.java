package org.uncle.lee.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<E> implements Aggregate<E> {
	private List<E> items;
	
	public ConcreteAggregate(){
		items = new ArrayList<E>();
	}

	@Override
	public boolean add(E e) {
		return items.add(e);
	}

	@Override
	public boolean remove(E e) {
		return items.remove(e);
	}

	@Override
	public Iterator<E> iterator() {
		return new ConcreteIterator<E>(items);
	}

}
