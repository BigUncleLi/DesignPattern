package org.uncle.lee.memento;

public class Client {
	public static void main(String[] args) {
		JavaBean bean = createOriginBean();
		showBean(bean);
		
		CareTaker saveMemento = saveMemento(bean);
		changeBean(bean);
		showBean(bean);
		
		restoreBean(bean, saveMemento);
		showBean(bean);
	}

	private static JavaBean createOriginBean() {
		return new JavaBean("beanA");
	}

	private static void showBean(JavaBean bean) {
		bean.display();
	}
	
	private static CareTaker saveMemento(JavaBean bean) {
		CareTaker taker = new CareTaker();
		Memento createMemento = bean.createMemento();
		taker.setMemento(createMemento);
		return taker;
	}
	
	private static void changeBean(JavaBean bean) {
		bean.setName("beanB");
	}
	
	private static void restoreBean(JavaBean bean, CareTaker saveMemento) {
		bean.setMemento(saveMemento.getMemento());
	}
}
