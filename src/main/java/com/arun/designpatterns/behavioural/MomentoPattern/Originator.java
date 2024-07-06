package main.java.com.arun.designpatterns.behavioural.MomentoPattern;

public class Originator {

	public String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public Momento saveToMomento() {
		return new Momento(state);
	}
	
}
