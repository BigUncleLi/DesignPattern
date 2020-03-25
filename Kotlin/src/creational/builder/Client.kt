package creational.builder

import creational.builder.bt.ProductBuilder
import creational.builder.origin.ConcreateBudilerA
import creational.builder.origin.ConcreateBuilderB
import creational.builder.origin.Director

fun main(array: Array<String>) {
    buildOriginProduct()
    buildBtProduct()
}

fun buildOriginProduct() {
    val director = Director()
    println(buildAProduct(director))
    println(buildBProduct(director))
    val product = director.constuct(ConcreateBudilerA())
    println(product)

    testBt0()
}

fun buildAProduct(director: Director): Product {
    val builderA = ConcreateBudilerA()
    return director.constuct(builderA)
}

fun buildBProduct(director: Director): Product {
    val builderB = ConcreateBuilderB()
    return director.constuct(builderB)
}

fun buildBtProduct() {
    println(ProductBuilder
            .featureA("a")
            .featureB("b")
            .featureC("c")
            .build())
}

fun testBt0() {
    val product = creational.builder.bt0.Product.Builder
            .featureA("feature a")
            .featureB("feature b")
            .featureC("feature c")
            .build()
    print(product)
}