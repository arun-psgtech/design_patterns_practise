package main.java.com.arun.designpatterns.behavioural.TemplateMethodPattern;

public class TemplateMethodTest {

	public static void main(String[] args) {
		Game cricketGame = new CricketGame();
		cricketGame.play();
		
		Game footballGame = new FootballGame();
		footballGame.play();
	}

}
