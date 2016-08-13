package org.uncle.lee.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Mail implements Cloneable, Serializable{
	private static final long serialVersionUID = 1L;
	private String receiver;
	private String subject;
	private String appellation;
	private String context;
	private String tail;
	private User user;
	
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
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	protected Mail clone() {
		return getCloneInstanceFromSerialize(this);
	}

	private Mail getCloneInstanceFromSerialize(Mail mail) {
		ByteArrayOutputStream bo = writeIntoStream(mail);
		return readFromStream(bo);
	}

	private ByteArrayOutputStream writeIntoStream(Mail mail) {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo;
		try {
			oo = new ObjectOutputStream(bo);
			oo.writeObject(mail);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bo;
	}
	
	private Mail readFromStream(ByteArrayOutputStream bo) {
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi;
		Mail readObject = null;
		try {
			oi = new ObjectInputStream(bi);
			readObject = (Mail) oi.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return readObject;
	}

	@Override
	public String toString() {
		return "Mail [receiver=" + receiver + ", subject=" + subject
				+ ", appellation=" + appellation + ", context=" + context
				+ ", tail=" + tail + ", user=" + user + "]";
	}
}
