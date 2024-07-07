package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public class SingleRoom implements RoomElement {
	
	public int roomPrice = 0;

	@Override
	public void accept(RoomVisitor roomVisitor) {
		roomVisitor.visit(this);
	}

}
