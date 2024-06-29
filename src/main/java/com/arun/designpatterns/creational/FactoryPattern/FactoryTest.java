package main.java.com.arun.designpatterns.creational.FactoryPattern;

public class FactoryTest {

	public static void main(String[] args) {

		PaymentMethod paymentInstance = PaymentFactory.getPaymentInstance("gpay");
		paymentInstance.doPayment();
		
		PaymentMethod paymentInstance1 = PaymentFactory.getPaymentInstance("paypal");
		paymentInstance1.doPayment();
		
		PaymentMethod paymentInstance2 = PaymentFactory.getPaymentInstance("razorpay");
		paymentInstance2.doPayment();

	}

}
