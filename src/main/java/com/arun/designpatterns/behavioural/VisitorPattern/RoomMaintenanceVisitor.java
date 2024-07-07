package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public class RoomMaintenanceVisitor implements RoomVisitor {

	@Override
	public void visit(SingleRoom singleRoom) {

		System.out.println("Room Maintance for SingleRoom");
	}

	@Override
	public void visit(DoubleRoom doubleRoom) {
		System.out.println("Room Maintance for DoubleRoom");

	}

	@Override
	public void visit(DeluxeRoom deluxeRoom) {
		System.out.println("Room Maintance for DeluxeRoom");

	}

}
