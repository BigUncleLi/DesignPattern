package org.uncle.lee.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class ConcreteAggregate<E> implements Aggregate<E> {
	private List<E> aggregate;
	private int index = 0;
	
	public ConcreteAggregate(){
		aggregate = new ArrayList<E>();
	}

	@Override
	public boolean add(E e){
		if(!isElementExist(e)){
			return aggregate.add(e);
		}else {
			return false;
		}
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c){
		for(E item : c){
			boolean isAddSuccessful = add(item);
			if(!isAddSuccessful){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public E get(int index){
		return aggregate.get(index);
	}
	
	@Override
	public boolean remove(E e){
		return aggregate.remove(e);
	}
	
	@Override
	public int size(){
		return aggregate.size();
	}
	
	@Override
	public void clear(){
		aggregate.clear();
	}
	
	private boolean isElementExist(E e){
		for(E item : aggregate){
			if(item.equals(e)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Iterator<E> iterator() {
		return new ConcreteIterator();
	}
	
	public  class  ConcreteIterator implements Iterator<E>{

		@Override
		public boolean hasNext() {
			return index < aggregate.size();
		}

		@Override
		public E next() {
			return aggregate.get(index++);
		}

		@Override
		public void remove() {}
	}
}