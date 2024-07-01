package main.java.com.arun.designpatterns.structural.ProxyPattern;

public class ATMProxy implements Account {

	@Override
	public void withdraw() {
		BankAccount account = new BankAccount();
		account.withdraw();

	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}
