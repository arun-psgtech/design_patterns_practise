package main.java.com.arun.designpatterns.behavioural.ObserverPattern;

public class Subscriber {

	String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	public void update(String message) {
		System.out.println("New video received with topic"+ message + "to "+name);
	}
	
}
