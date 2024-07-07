package main.java.com.arun.designpatterns.behavioural.VisitorPattern;

public interface RoomVisitor {
	
	public void visit(SingleRoom singleRoom);
	public void visit(DoubleRoom doubleRoom);
	public void visit(DeluxeRoom deluxeRoom);

}
