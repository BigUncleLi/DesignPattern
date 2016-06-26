package org.uncle.lee.iterator;

import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		Aggregate<JavaBean> javaBeans = new ConcreteAggregate<JavaBean>();
		
		JavaBean beanA = new JavaBean("beanA");
		JavaBean beanB = new JavaBean("beanB");
		JavaBean beanC = new JavaBean("beanC");
		
		javaBeans.add(beanA);
		javaBeans.add(beanB);
		javaBeans.add(beanC);
		
		diaplayAggregate(javaBeans);
	}

	private static void diaplayAggregate(Aggregate<JavaBean> javaBeans) {
		Iterator<JavaBean> iterator = javaBeans.iterator();
		while(iterator.hasNext()){
			iterator.next().display();
		}
	}
}
