package main.java.com.arun.designpatterns.structural.DedoratorPattern;

public class CheeseBurstPizzaDecorator extends PizzaDecorator {
	

	public CheeseBurstPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String bake() {
		return pizza.bake() + " Cheese Burst ";
	}

}
