package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public class DoubleRoom implements RoomElement {

	public int roomPrice = 0;
	@Override
	public void accept(RoomVisitor roomVisitor) {

		roomVisitor.visit(this);
	}

}
