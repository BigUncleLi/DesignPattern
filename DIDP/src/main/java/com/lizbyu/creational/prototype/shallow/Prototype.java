package com.lizbyu.creational.prototype.shallow;

public class Prototype implements Cloneable {
    private int intValue;
    private String strValue;
    private Object innerClass;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public Object getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(Object innerClass) {
        this.innerClass = innerClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
