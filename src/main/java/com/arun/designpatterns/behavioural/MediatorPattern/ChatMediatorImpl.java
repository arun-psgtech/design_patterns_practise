package main.java.com.arun.designpatterns.behavioural.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	
	List<User> userList = new ArrayList<>();

	@Override
	public void sendMessage(String message, User user) {
		for(User u : userList) {
			if(!u.equals(user)) {
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
	}

}
