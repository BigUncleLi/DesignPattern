package creational.factory.simple

class ShapeFactory {
    fun getShape(shapeType : ShapeType) : Shape {
        return when(shapeType) {
            ShapeType.CIRCLE -> Circle()
            ShapeType.RECTANGLE -> Rectangle()
            ShapeType.SQUARE -> Square()
        }
    }
}