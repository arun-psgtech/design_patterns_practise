package main.java.com.arun.designpatterns.behavioural.StatePattern;

public class OutOfStockState implements VendingMachineState {

	@Override
	public void handleRequest() {
		System.out.println("The selected product is out of stock");
	}

}
