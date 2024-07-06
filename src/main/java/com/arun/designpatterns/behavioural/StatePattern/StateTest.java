package main.java.com.arun.designpatterns.behavioural.StatePattern;

public class StateTest {

	public static void main(String[] args) {
		VendingMachineContext context = new VendingMachineContext();
		context.setState(new ReadyState());
		context.handleRequest();
		
		context.setState(new ProductSelectionState());
		context.handleRequest();
		
		context.setState(new PaymentState());
		context.handleRequest();
		
		context.setState(new OutOfStockState());
		context.handleRequest();
		
	}

}
