package main.java.com.arun.designpatterns.structural.AdapterPattern;

public class AdapterPatternTest {

	public static void main(String[] args) {

		GPayAdapter gpayAdapter = new GPayAdapter(new GPayPayments());
		gpayAdapter.processPayment();
		
		
		PayPalAdapter palAdapter = new PayPalAdapter(new PaypalPayments());
		palAdapter.processPayment();
		
	}

}
