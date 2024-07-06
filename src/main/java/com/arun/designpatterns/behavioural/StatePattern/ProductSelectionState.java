package main.java.com.arun.designpatterns.behavioural.StatePattern;

public class ProductSelectionState implements VendingMachineState{

	@Override
	public void handleRequest() {

		System.out.println("Products can be selected now");
	}

}
