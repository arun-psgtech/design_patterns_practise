package main.java.com.arun.designpatterns.behavioural.MomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	List<Momento> momentoList = new ArrayList<>();
	
	public void add(Momento momento) {
		momentoList.add(momento);
	}
	
	public Momento get(int index) {
		return momentoList.get(index);
	}

}
