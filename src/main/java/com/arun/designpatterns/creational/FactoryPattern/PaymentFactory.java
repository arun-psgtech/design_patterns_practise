package main.java.com.arun.designpatterns.creational.FactoryPattern;

public class PaymentFactory {

	
	public static PaymentMethod getPaymentInstance(String method) {
		return switch(method) {
		case "paypal" -> new PayPalPayments();
		case "gpay" -> new GpayPayments();
		case "razorpay" -> new RazorPayPayments();
		default -> null;
		};
	}
}
