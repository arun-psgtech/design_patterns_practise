package main.java.com.arun.designpatterns.structural.ProxyPattern;

public class BankAccount implements Account {

	@Override
	public void withdraw() {
		System.out.println("Method to retrieve the amount");
	}

	@Override
	public String getAccountNumber() {
		return "123456789";
	}

}
