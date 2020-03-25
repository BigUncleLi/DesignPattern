package creational.builder.origin

import creational.builder.Product

class ConcreateBuilderB : Builder {
    val product = Product()

    override fun setFeatureA() {
        product.featureA = "Feature B->A"
    }

    override fun setFeatureB() {
        product.featureB = "Feature B->B"
    }

    override fun setFeatureC() {
        product.featureC = "Feature B->C"
    }

    override fun product(): Product {
        return product
    }
}