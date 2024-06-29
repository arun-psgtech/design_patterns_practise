package main.java.com.arun.designpatterns.structural.AdapterPattern;

public class GPayAdapter implements PaymentProcessor {
	
	GPayPayments gPayPayments;
	
	public GPayAdapter(GPayPayments gPayPayments) {
		this.gPayPayments = gPayPayments;
	}

	@Override
	public void processPayment() {
		gPayPayments.makePayments();

	}

}
