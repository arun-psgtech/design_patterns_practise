package main.java.com.arun.designpatterns.behavioural.MediatorPattern;

public class UserImpl extends User {

	public UserImpl(String name, ChatMediator mediator) {
		super(name, mediator);
	}

	@Override
	public void send(String message) {
		System.out.println(message);
		mediator.sendMessage(message, this);

	}

	@Override
	public void receive(String message) {
		System.out.println(name +" user received the message "+message);

	}

}
