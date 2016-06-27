package org.uncle.lee.visitor;

public class ObjectStructure implements Element{
	private Element elementA;
	private Element elementB;
	
	public ObjectStructure(){
		elementA = new ConcreteElementA();
		elementB = new ConcreteElementB();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit();
		elementA.accept(visitor);
		elementB.accept(visitor);
	}
}
