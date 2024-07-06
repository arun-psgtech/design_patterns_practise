package main.java.com.arun.designpatterns.behavioural.MomentoPattern;

public class MomentoTest {

	public static void main(String[] args) {

		Originator o1 = new Originator();
		o1.setState("state1");
		Originator o2 = new Originator();
		o2.setState("state2");
		
		CareTaker c = new CareTaker();
		c.add(o1.saveToMomento());
		c.add(o2.saveToMomento());
		
		System.out.println(c.get(0).getState());
		
	}

}
