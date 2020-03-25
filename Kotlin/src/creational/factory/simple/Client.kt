package creational.factory.simple

fun main(array: Array<String>) {
    ShapeFactory().getShape(ShapeType.CIRCLE).draw()
    ShapeFactory().getShape(ShapeType.SQUARE).draw()
    ShapeFactory().getShape(ShapeType.RECTANGLE).draw()
}