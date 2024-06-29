package main.java.com.arun.designpatterns.creational.AbstractfactoryPattern;

public class ShapeFactory implements AbstractFactory {

	public Shape createShape(String shapeType) {
		return switch(shapeType) {
		case "circle"-> new Circle();
		case "square" -> new Square();
		default -> null;
		};
		
	}


	@Override
	public Color createColor(String colorType) {
		return null;
	}

}
