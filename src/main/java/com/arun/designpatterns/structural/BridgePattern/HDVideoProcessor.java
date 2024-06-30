package main.java.com.arun.designpatterns.structural.BridgePattern;

public class HDVideoProcessor implements VideoProcessor {

	@Override
	public void processVideo(String videoFile) {
		System.out.println("Video file is playing");

	}

}
