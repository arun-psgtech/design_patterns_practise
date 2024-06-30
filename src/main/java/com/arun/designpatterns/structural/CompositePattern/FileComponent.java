package main.java.com.arun.designpatterns.structural.CompositePattern;

public class FileComponent implements FileSystemComponent {
	
	String name;
	
	FileComponent(String name) {
		this.name = name;
	}

	@Override
	public void showComponent() {

		System.out.println("File is displayed"+name);
	}

}
