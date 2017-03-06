package org.uncle.lee.visitor;

public class Client {
	public static void main(String[] args) {
		Element structure = new ObjectStructure();
		structure.accept(new ConcreteVisitorA());
		structure.accept(new ConcreteVisitorB());
		structure.accept(new ConcreteVisitor());
	}
}
