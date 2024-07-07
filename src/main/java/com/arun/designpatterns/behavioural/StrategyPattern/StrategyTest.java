package main.java.com.arun.designpatterns.behavioural.StrategyPattern;

public class StrategyTest {

	public static void main(String[] args) {
		int[] arr = {5, 7, 1, 8, 6, 3};
		Context context1 = new Context(new MergeSortStrategy());
		context1.performSort(arr);
		
		Context context2 = new Context(new BubbleSortStrategy());
		context2.performSort(arr);
		
		Context context3 = new Context(new SelectionSortStrategy());
		context3.performSort(arr);
		
		
	}

}
