package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public interface RoomElement {

	
	
	int roomPrice = 0;

	public abstract void accept(RoomVisitor roomVisitor);
}
