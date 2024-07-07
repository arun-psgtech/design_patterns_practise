package main.java.com.arun.designpatterns.behavioural.StrategyPattern;

public class SelectionSortStrategy implements SortStrategy {

	@Override
	public void performSort(int[] array) {
		System.out.println("Array sorted using selection sort");

	}

}
