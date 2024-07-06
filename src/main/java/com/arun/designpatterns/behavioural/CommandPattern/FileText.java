package main.java.com.arun.designpatterns.behavioural.CommandPattern;

public class FileText {
	
	String fileName;
	
	FileText(String fileName) {
		this.fileName = fileName;
	}
	
	public void openFile() {
		System.out.println(fileName + " File got opened");
	}
	
	public void saveFile() {
		System.out.println(fileName + " File got saved");
	}

}
