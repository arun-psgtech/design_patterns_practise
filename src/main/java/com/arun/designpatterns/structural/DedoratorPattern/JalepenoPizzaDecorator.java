package main.java.com.arun.designpatterns.structural.DedoratorPattern;

public class JalepenoPizzaDecorator extends PizzaDecorator {

	public JalepenoPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String bake() {
		return pizza.bake() + " Jalepeno Added ";
	}

}
