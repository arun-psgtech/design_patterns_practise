package main.java.com.arun.designpatterns.behavioural.StrategyPattern;

public class Context {
	
	private SortStrategy sortStrategy;
	
	public Context(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	
	public void performSort(int[] array) {
		sortStrategy.performSort(array);
	}

}
