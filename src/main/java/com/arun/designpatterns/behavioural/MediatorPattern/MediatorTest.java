package main.java.com.arun.designpatterns.behavioural.MediatorPattern;

public class MediatorTest {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl("user1", mediator);
		User user2 = new UserImpl("user2", mediator);
		User user3 = new UserImpl("user3", mediator);
		User user4 = new UserImpl("user4", mediator);
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hai Everyone");
		
	}

}
