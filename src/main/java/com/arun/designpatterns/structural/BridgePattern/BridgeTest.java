package main.java.com.arun.designpatterns.structural.BridgePattern;

public class BridgeTest {

	public static void main(String[] args) {

		Video v1 = new YoutubeVideo(new HDVideoProcessor());
		v1.play();
		
		Video v2 = new YoutubeVideo(new BlueRayVideoProcessor());
		v2.play();
		Video v3 = new AmazonPrimeVideo(new HDVideoProcessor());
		v3.play();
		Video v4 = new AmazonPrimeVideo(new BlueRayVideoProcessor());
		v4.play();
	}

}
