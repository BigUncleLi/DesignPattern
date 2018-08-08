package creational.builder.origin

import creational.builder.Product

class ConcreateBudilerA : Builder {
    val product = Product()

    override fun setFeatureA() {
        product.featureA = "Feature A->A"
    }

    override fun setFeatureB() {
        product.featureB = "Feature B->B"
    }

    override fun setFeatureC() {
        product.featureC = "Feature C->A"
    }

    override fun product(): Product {
        return product
    }
}