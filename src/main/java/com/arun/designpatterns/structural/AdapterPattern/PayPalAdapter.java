package main.java.com.arun.designpatterns.structural.AdapterPattern;

public class PayPalAdapter implements PaymentProcessor {
	
	PaypalPayments payments;
	
	public PayPalAdapter(PaypalPayments payments) {
		this.payments = payments;
	}

	@Override
	public void processPayment() {
		payments.doPayments();
	}

}
