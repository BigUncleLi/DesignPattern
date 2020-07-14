package com.lizbyu.creational.prototype.deep;

public class Prototype implements Cloneable {
    private int intValue;
    private String strValue;
    private ComplexObject object;

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

    public ComplexObject getObject() {
        return object;
    }

    public void setObject(ComplexObject object) {
        this.object = object;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();
        clone.setObject((ComplexObject) this.object.clone());
        return clone;
    }
}
