package main.java.com.arun.designpatterns.behavioural.ObserverPattern;

public class Observertest {

	public static void main(String[] args) {
		Subscriber s1 = new Subscriber("S1");
		Subscriber s2 = new Subscriber("S2");
		Subscriber s3 = new Subscriber("S3");
		
		YoutubeChannel channel = new YoutubeChannel("JavaTech");
		channel.addSubscribers(s1);
		channel.addSubscribers(s2);
		channel.addSubscribers(s3);
		channel.update("Java");
		
	}

}
