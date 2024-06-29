package main.java.com.arun.designpatterns.creational.AbstractfactoryPattern;

public class FactoryProducer {
	
	
	public static AbstractFactory getFactory(String model) {
		return switch(model) {
		case "shape" -> new ShapeFactory();
		case "color" -> new ColorFactory();
		default -> null;
		};
	}
	

}
