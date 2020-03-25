package org.uncle.lee.memento.origin;

public class Originator {
	private String statue;
	
	public void setStatue(String statue){
		this.statue = statue;
	}
	
	public Memento createMemento(){
		Memento memento = new Memento();
		memento.setStatue(statue);
		return memento;
	}
	
	public void resetMemento(Memento memento){
		this.setStatue(memento.getStatue());
	}
}
