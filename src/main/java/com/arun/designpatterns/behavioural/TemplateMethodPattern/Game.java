package main.java.com.arun.designpatterns.behavioural.TemplateMethodPattern;

public abstract class Game {
	
	public abstract void startGame();
	
	public abstract void initialize();
	
	public abstract void endGame();
	
	public void play() {
		startGame();
		initialize();
		endGame();
	}

}
