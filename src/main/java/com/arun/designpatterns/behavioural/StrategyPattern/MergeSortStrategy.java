package main.java.com.arun.designpatterns.behavioural.StrategyPattern;

public class MergeSortStrategy implements SortStrategy {

	@Override
	public void performSort(int[] array) {

		System.out.println("Array sorted using Merge Sort");
	}

}
