package org.uncle.lee.prototype;

public class Mail implements Cloneable{
	private String receiver;
	private String subject;
	private String appellation;
	private String context;
	private String tail;
	
	public Mail(AdvTemplate advTemplate) {
		super();
		this.subject = advTemplate.advSubject();
		this.context = advTemplate.advContext();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}
	
	@Override
	protected Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}

	@Override
	public String toString() {
		return "Mail [receiver=" + receiver + ", subject=" + subject
				+ ", appellation=" + appellation + ", context=" + context
				+ ", tail=" + tail + "]";
	}
}
