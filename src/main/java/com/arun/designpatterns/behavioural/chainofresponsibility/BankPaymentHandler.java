package main.java.com.arun.designpatterns.behavioural.chainofresponsibility;

public class BankPaymentHandler extends PaymentHandler {

	
	
	
	@Override
	public void handleAmount(Double amount) {
		if(amount<1000) {
			System.out.println(amount +" amount got processed by Bank");
		} else {
			next.handleAmount(amount);
		}
		
	}

}
