package designpatterns.factorypattern;

public class ShapeFactory {
	Shape shape;

	public Shape getShape(String shapeType) {
		if (shapeType.equals("circle")) {
			return shape = new Circle();
		} else if (shapeType.equals("Rectangle")) {
			return shape = new Rectangle();
		} else {
			return shape = new Circle();
		}
	}
}
