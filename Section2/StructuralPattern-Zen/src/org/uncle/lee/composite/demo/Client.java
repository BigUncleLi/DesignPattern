package org.uncle.lee.composite.demo;

public class Client {
	public static void main(String[] args) {
		Composite chairman = new CompositeImpl("ChairMan");

		Composite ceo = new CompositeImpl("CEO");
		chairman.addChild(ceo);

		Composite vp = new CompositeImpl("vp");
		ceo.addChild(vp);

		Composite coo = new CompositeImpl("COO");
		chairman.addChild(coo);

		showEmployee(chairman);
	}

	private static void showEmployee(Employee chairman) {
		if (chairman instanceof Composite) {
			printItself(chairman);
			printChildren((Composite) chairman);
		} else {
			printItself(chairman);
		}
	}

	private static void printItself(Employee chairman) {
		chairman.showInfo();
	}

	private static void printChildren(Composite chairman) {
		for (Employee employee : chairman.getChildren()) {
			showEmployee(employee);
		}
	}
}
