package main.java.com.arun.designpatterns.behavioural.StatePattern;

public class PaymentState implements VendingMachineState {

	@Override
	public void handleRequest() {

		System.out.println("Payment can be initiated now");
	}

}
