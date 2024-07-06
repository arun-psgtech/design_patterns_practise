package main.java.com.arun.designpatterns.behavioural.CommandPattern;

public class OpenFileTextOperation extends FileTextOperation {

	OpenFileTextOperation(FileText fileText) {
		super(fileText);
	}

	@Override
	public void execute() {
		fileText.openFile();

	}

}
