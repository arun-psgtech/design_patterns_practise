package main.java.com.arun.designpatterns.structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComponent implements FileSystemComponent {
	
	List<FileSystemComponent> compList = new ArrayList<>();
	
	String name;
	
	public DirectoryComponent(String name) {
		this.name = name;
	}

	@Override
	public void showComponent() {

		System.out.println("Display the folder = "+name);
	}
	
	public void addComponent(FileSystemComponent comp) {
		compList.add(comp);
	}
	
	public void removeComponent(FileSystemComponent comp) {
		compList.remove(comp);
	}
	
	
	public void displayDetails() {
		System.out.println("Display all components inside = "+ name);
		for(FileSystemComponent comp : compList) {
			comp.showComponent();
		}
	}

}
