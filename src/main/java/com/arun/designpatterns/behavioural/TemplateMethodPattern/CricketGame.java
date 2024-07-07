package main.java.com.arun.designpatterns.behavioural.TemplateMethodPattern;

public class CricketGame extends Game {

	@Override
	public void startGame() {
		System.out.println("Starting Cricket Game");

	}

	@Override
	public void initialize() {
		System.out.println("Initializing Cricket Game");
	}

	@Override
	public void endGame() {
		System.out.println("End Cricket Game");
	}

}
