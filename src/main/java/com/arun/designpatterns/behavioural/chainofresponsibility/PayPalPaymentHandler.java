package main.java.com.arun.designpatterns.behavioural.chainofresponsibility;

public class PayPalPaymentHandler extends PaymentHandler {

	@Override
	public void handleAmount(Double amount) {
		System.out.println(amount + " amount got processed by PayPal");
	}

}
