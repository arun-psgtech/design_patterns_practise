package main.java.com.arun.designpatterns.structural.DedoratorPattern;

public class DecoratorTest {

	public static void main(String[] args) {

		Pizza pizza = new JalepenoPizzaDecorator(new CheeseBurstPizzaDecorator(new BasePizza()));
		
		System.out.println(pizza.bake());
	}

}
