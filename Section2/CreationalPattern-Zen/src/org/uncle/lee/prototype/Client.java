package org.uncle.lee.prototype;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "PrototypeClient";
	private static final int MAX_NUM = 10;
	
	public static void main(String[] args) {
		Mail mail = new Mail(new AdvTemplate());
		sendMailForTimes(MAX_NUM, mail);
	}

	private static void sendMailForTimes(int maxNum, Mail mail) {
		for(int i = 0; i < maxNum; i++){
			sendMain(i, mail);
		}
	}

	private static void sendMain(int index, Mail mail) {
		Mail cloneMail = mail.clone();
		cloneMail.setTail("lol");
		cloneMail.setAppellation(index + "Sir");
		cloneMail.setReceiver("xx@xx.com");
		sendMail(cloneMail);
	}

	private static void sendMail(Mail mail) {
		LogUtils.d(TAG, mail.toString());
	}
}
