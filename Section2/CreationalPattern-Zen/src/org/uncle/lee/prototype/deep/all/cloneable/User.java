package org.uncle.lee.prototype.deep.all.cloneable;

public class User implements Cloneable {
	private String name;
	private int old;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "User-@" + this.hashCode() + " [name=" + name + ", old=" + old
				+ ", sex=" + sex + "]";
	}

}
