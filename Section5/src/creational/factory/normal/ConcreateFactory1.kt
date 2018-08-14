package creational.factory.normal

class ConcreateFactory1 : Factory {
    override fun createProduct(): Product {
        return ConcreateProduct1()
    }
}