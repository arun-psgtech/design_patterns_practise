package main.java.com.arun.designpatterns.creational.AbstractfactoryPattern;

public class ColorFactory implements AbstractFactory {

	@Override
	public Color createColor(String colorType) {
		return switch(colorType) {
		case "red" -> new Red();
		case "blue" -> new Blue();
		default-> null;
		};
	}

	@Override
	public Shape createShape(String shapeType) {
		return null;
	}

}
