package creational.factory.normal

class ConcreateFactory2 : Factory {
    override fun createProduct(): Product {
        return ConcreateProduct2()
    }
}