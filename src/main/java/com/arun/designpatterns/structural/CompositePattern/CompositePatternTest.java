package main.java.com.arun.designpatterns.structural.CompositePattern;


public class CompositePatternTest {

	public static void main(String[] args) {

		DirectoryComponent d1 = new DirectoryComponent("HeadDepartmentDir");
		FileSystemComponent f1 = new FileComponent("HeadDepartmentFile");
		d1.addComponent(f1);
		
		d1.showComponent();
		d1.displayDetails();
	}

}
