package designpatterns.factorypattern;

public class TestShapeFactory {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		shapeFactory.getShape("xyz").draw();
	}

}
