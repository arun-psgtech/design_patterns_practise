package main.java.com.arun.designpatterns.behavioural.TemplateMethodPattern;

public class FootballGame extends Game {

	@Override
	public void startGame() {
		System.out.println("Starting Football Game");
	}

	@Override
	public void initialize() {
		System.out.println("Initializing Football Game");
		
	}

	@Override
	public void endGame() {
		System.out.println("End Football Game");
	}

}
