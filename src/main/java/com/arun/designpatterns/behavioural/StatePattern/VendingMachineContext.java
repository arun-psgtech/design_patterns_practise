package main.java.com.arun.designpatterns.behavioural.StatePattern;

public class VendingMachineContext {

	VendingMachineState state;
	
	public void setState(VendingMachineState state) {
		this.state = state;
	}
	
	public void handleRequest() {
		state.handleRequest();
	}
}
