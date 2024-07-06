package main.java.com.arun.designpatterns.behavioural.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

	List<Subscriber> subscribers = new ArrayList<>();
	
	String name;
	
	public YoutubeChannel(String name) {
		this.name = name;
	}

	public void update(String topic) {
		
		for(Subscriber subs : subscribers) {
			subs.update(topic);
		}
	}
	
	public void addSubscribers(Subscriber s) {
		subscribers.add(s);
	}
	
	
	
}
