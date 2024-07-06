package main.java.com.arun.designpatterns.behavioural.MomentoPattern;

public class Momento {
	
	public String state;
	
	Momento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

}
