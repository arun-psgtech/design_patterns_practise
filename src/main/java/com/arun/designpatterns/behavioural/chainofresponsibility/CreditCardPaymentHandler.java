package main.java.com.arun.designpatterns.behavioural.chainofresponsibility;

public class CreditCardPaymentHandler extends PaymentHandler {

	@Override
	public void handleAmount(Double amount) {
		if(amount<2000) {
			System.out.println(amount +" amount got processed by CreditCard");
		} else {
			next.handleAmount(amount);
		}
		
	}

}
