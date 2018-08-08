package creational.builder.origin

import creational.builder.Product

interface Builder {
    fun setFeatureA()
    fun setFeatureB()
    fun setFeatureC()
    fun product() : Product
}