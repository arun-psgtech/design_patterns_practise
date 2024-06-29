package main.java.com.arun.designpatterns.creational.AbstractfactoryPattern;

public class AbstractFactorytest {

	public static void main(String[] args) {

		AbstractFactory factory = FactoryProducer.getFactory("shape");
		factory.createShape("square").draw();
		
		AbstractFactory factory1 = FactoryProducer.getFactory("color");
		factory1.createColor("red").fillColor();
	}

}
