package main.java.com.arun.designpatterns.behavioural.chainofresponsibility;

public abstract class PaymentHandler {

	PaymentHandler next;
	
	public void setNext(PaymentHandler paymentHandler) {
		this.next = paymentHandler;
	}
	
	public abstract void handleAmount(Double amount);
}
