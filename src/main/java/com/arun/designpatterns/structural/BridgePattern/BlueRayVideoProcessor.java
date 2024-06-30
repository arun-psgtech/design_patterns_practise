package main.java.com.arun.designpatterns.structural.BridgePattern;

public class BlueRayVideoProcessor implements VideoProcessor {

	@Override
	public void processVideo(String videoFile) {

		System.out.println("Video playing in Blueray quality");
	}

}
