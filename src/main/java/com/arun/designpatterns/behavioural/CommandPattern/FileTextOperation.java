package main.java.com.arun.designpatterns.behavioural.CommandPattern;

public abstract class FileTextOperation {

	FileText fileText;
	
	FileTextOperation(FileText fileText) {
		this.fileText = fileText;
	}
	
	public abstract void execute();
}
