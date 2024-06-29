package main.java.com.arun.designpatterns.creational.AbstractfactoryPattern;


public interface AbstractFactory {

	Color createColor(String colorType);
	Shape createShape(String shapeType);
	
}
