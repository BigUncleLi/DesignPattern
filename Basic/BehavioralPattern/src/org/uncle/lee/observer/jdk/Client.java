
package org.uncle.lee.observer.jdk;

public class Client {
	public static void main(String[] args) {
		Observer observer = new Observer();
		Subject subject = new Subject();
		subject.changeAndOpreate();
		subject.registeObserver(observer);
		subject.opreate();
		subject.changeAndOpreate();
	}
}
