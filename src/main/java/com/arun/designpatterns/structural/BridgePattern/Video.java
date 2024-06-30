package main.java.com.arun.designpatterns.structural.BridgePattern;

public abstract class Video {
	
	VideoProcessor processor;
	
	public Video(VideoProcessor processor) {
		this.processor = processor;
	}

	public abstract void play();
}
