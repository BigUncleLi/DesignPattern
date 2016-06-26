package org.uncle.lee.observer.manual;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = Client.class.getSimpleName();
	
	public static void main(String[] args) {
		Observer observer = createObserver();
		Subject subject = new Subject();
		subject.opreate();
		subject.registeObserver(observer);
		subject.opreate();
	}

	private static Observer createObserver() {
		Observer observer = new Observer() {
			@Override
			public void update(Observer observer) {
				LogUtils.d(TAG, "observer - " + observer + " update");
			}
			
			@Override
			public void update(Observer observer, Object msg) {
				LogUtils.d(TAG, "observer - " + observer + " update, message is : " + msg.toString());
			}
		};
		return observer;
	}
}
