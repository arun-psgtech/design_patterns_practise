package main.java.com.arun.designpatterns.creational.FactoryPattern;

public class GpayPayments implements PaymentMethod {

	@Override
	public void doPayment() {
		System.out.println("Payment done with GPay");

	}

}
