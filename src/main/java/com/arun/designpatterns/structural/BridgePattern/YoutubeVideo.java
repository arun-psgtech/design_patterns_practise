package main.java.com.arun.designpatterns.structural.BridgePattern;

public class YoutubeVideo extends Video {

	public YoutubeVideo(VideoProcessor processor) {
		super(processor);
	}

	@Override
	public void play() {

		System.out.println("Playing Youtube Video");
		processor.processVideo("Songs");
	}

}
