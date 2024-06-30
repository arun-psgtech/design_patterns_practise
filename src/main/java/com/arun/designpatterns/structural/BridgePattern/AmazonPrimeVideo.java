package main.java.com.arun.designpatterns.structural.BridgePattern;

public class AmazonPrimeVideo extends Video {

	public AmazonPrimeVideo(VideoProcessor processor) {
		super(processor);
	}

	@Override
	public void play() {

		System.out.println("Playing AmazonPrime video");
		processor.processVideo("Songs");
	}

}
