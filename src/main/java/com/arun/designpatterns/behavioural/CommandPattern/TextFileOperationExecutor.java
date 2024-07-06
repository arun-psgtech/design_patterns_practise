package main.java.com.arun.designpatterns.behavioural.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {
	
	private List<FileTextOperation> opsList = new ArrayList<>();
	
	
	public void  executeOperation(FileTextOperation fileTextOperation) {
		opsList.add(fileTextOperation);
		fileTextOperation.execute();
	}

}
