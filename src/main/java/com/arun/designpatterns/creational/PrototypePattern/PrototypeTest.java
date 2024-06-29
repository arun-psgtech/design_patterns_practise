package main.java.com.arun.designpatterns.creational.PrototypePattern;

public class PrototypeTest {

	public static void main(String[] args) {

		Circle c = new Circle(12);
		System.out.println(c);
		c.draw();
		
		Circle c1 = (Circle)c.clone();
		System.out.println(c1);
		c1.draw();
	}

}
