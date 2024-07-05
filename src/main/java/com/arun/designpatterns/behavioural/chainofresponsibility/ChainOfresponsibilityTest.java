package main.java.com.arun.designpatterns.behavioural.chainofresponsibility;

public class ChainOfresponsibilityTest {

	public static void main(String[] args) {

		PaymentHandler bank = new BankPaymentHandler();
		PaymentHandler creditCard = new CreditCardPaymentHandler();
		PaymentHandler paypal = new PayPalPaymentHandler();
		
		bank.setNext(creditCard);
		creditCard.setNext(paypal);
		
		bank.handleAmount(200.0);
		bank.handleAmount(1600.0);
		bank.handleAmount(3000.0);
	}

}
