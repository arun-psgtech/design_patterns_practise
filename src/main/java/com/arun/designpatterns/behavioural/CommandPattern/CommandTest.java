package main.java.com.arun.designpatterns.behavioural.CommandPattern;

public class CommandTest {

	public static void main(String[] args) {
		TextFileOperationExecutor executor = new TextFileOperationExecutor();
		executor.executeOperation(new OpenFileTextOperation(new FileText("text.txt")));
		executor.executeOperation(new SaveFileTextOperation(new FileText("text.txt")));
		

	}

}
