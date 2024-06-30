package main.java.com.arun.designpatterns.structural.DedoratorPattern;

public class PizzaDecorator implements Pizza {
	
	Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String bake() {
		return pizza.bake();
	}

}
