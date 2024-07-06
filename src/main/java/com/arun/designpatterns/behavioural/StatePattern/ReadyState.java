package main.java.com.arun.designpatterns.behavioural.StatePattern;

public class ReadyState implements VendingMachineState {

	@Override
	public void handleRequest() {

		System.out.println("Vending Machine is getting ready");
	}

}
