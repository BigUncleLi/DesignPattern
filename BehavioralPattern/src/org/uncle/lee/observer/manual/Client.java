package org.uncle.lee.observer.manual;

import org.uncle.lee.observer.jdk.Observer;
import org.uncle.lee.observer.jdk.Subject;

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
