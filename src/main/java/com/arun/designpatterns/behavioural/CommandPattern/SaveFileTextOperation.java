package main.java.com.arun.designpatterns.behavioural.CommandPattern;

public class SaveFileTextOperation extends FileTextOperation {

	SaveFileTextOperation(FileText fileText) {
		super(fileText);
	}

	@Override
	public void execute() {
		fileText.saveFile();

	}

}
