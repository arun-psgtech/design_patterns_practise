package main.java.com.arun.designpatterns.creational.PrototypePattern;

public class Circle implements Shape, Cloneable {
	
	
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}

	@Override
	public void draw() {

		System.out.println("Circle drawn with radius "+ radius);
	}
	
	@Override
	public Object clone() {
		return new Circle(this.radius);
	}

}
