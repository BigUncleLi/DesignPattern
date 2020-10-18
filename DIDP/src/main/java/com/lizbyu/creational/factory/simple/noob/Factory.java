package com.lizbyu.creational.factory.simple.noob;

public class Factory {
    public Product createProduct(Product.Type type) {
        if (type == Product.Type.ONE) {
            return new ConcreteProductOne();
        } else if (type == Product.Type.TWO) {
            return new ConcreteProductTwo();
        } else {
            throw new IllegalArgumentException("error input type : " + type);
        }
    }
}
