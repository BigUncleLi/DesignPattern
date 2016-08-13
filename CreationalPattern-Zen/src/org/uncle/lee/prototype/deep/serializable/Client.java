package org.uncle.lee.prototype.deep.serializable;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "ZenDeepPrototypeBySerializable";
	
	public static void main(String[] args) {
		Mail mail = createMail();
		LogUtils.d(TAG, "origin user : " + mail.getUser().toString());
		
		Mail cloneMail = createCloneMail(mail);
		LogUtils.d(TAG, "clone user : " + cloneMail.getUser().toString());
	}

	@Deprecated
	private static Mail createMail() {
		Mail mail = new Mail(new AdvTemplate());
		setUser(mail);
		return mail;
	}
	
	private static void setUser(Mail mail) {
		User user = new User();
		user.setName("big uncle li");
		user.setOld(30);
		user.setSex("man");
		mail.setUser(user);
	}

	private static Mail createCloneMail(Mail mail) {
		return mail.clone();
	}
}
