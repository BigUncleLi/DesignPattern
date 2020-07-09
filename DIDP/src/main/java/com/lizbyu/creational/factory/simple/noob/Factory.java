package com.lizbyu.creational.factory.simple.noob;

public class Factory {
    public Product createProduct(ProductType type) {
        if (type == ProductType.ONE) {
            return new ConcreteProductOne();
        } else if (type == ProductType.TWO) {
            return new ConcreteProductTwo();
        } else {
            throw new IllegalArgumentException("error input type : " + type);
        }
    }
}
