package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public class DeluxeRoom implements RoomElement {
	
	int roomPrice = 0;

	@Override
	public void accept(RoomVisitor roomVisitor) {

		roomVisitor.visit(this);
	}

}
