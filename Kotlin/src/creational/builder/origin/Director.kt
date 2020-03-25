package creational.builder.origin

import creational.builder.Product

class Director {
    fun constuct(builder : Builder) : Product {
        builder.setFeatureA()
        builder.setFeatureB()
        builder.setFeatureC()
        return builder.product()
    }
}