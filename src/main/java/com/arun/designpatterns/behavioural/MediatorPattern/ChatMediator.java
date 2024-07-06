package main.java.com.arun.designpatterns.behavioural.MediatorPattern;

public interface ChatMediator {

	public void sendMessage(String message, User user);
	
	public void addUser(User user);
}
