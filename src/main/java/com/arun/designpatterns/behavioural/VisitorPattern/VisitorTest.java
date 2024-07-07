package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public class VisitorTest {

	public static void main(String[] args) {

		RoomElement singleRoom = new SingleRoom();
		singleRoom.accept(new RoomPricingVisitor());
		System.out.println("Single room price is"+((SingleRoom)singleRoom).roomPrice);
		
		singleRoom.accept(new RoomMaintenanceVisitor());
		
		RoomElement doubleRoom = new DoubleRoom();
		doubleRoom.accept(new RoomPricingVisitor());
		System.out.println("Single room price is"+((DoubleRoom)doubleRoom).roomPrice);
		
		doubleRoom.accept(new RoomMaintenanceVisitor());
		
		RoomElement deluxeRoom = new DeluxeRoom();
		deluxeRoom.accept(new RoomPricingVisitor());
		System.out.println("Single room price is"+((DeluxeRoom)deluxeRoom).roomPrice);
		
		deluxeRoom.accept(new RoomMaintenanceVisitor());
		
	}

}
