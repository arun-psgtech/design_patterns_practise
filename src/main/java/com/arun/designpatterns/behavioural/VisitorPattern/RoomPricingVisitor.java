package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public class RoomPricingVisitor implements RoomVisitor {


	@Override
	public void visit(SingleRoom singleRoom) {

		System.out.println("Pricing computation logic for Single Room");
		singleRoom.roomPrice=1000;
	}

	@Override
	public void visit(DoubleRoom doubleRoom) {
		System.out.println("Pricing computation logic for Double Room");
		doubleRoom.roomPrice=2000;
		
	}

	@Override
	public void visit(DeluxeRoom deluxeRoom) {
		System.out.println("Pricing computation logic for Deluxe Room");
		deluxeRoom.roomPrice=4000;
		
	}

}
