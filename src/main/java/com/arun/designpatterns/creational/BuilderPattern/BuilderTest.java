package main.java.com.arun.designpatterns.creational.BuilderPattern;

public class BuilderTest {

	public static void main(String[] args) {
		HttpClient.HttpClientBuilder builder = new HttpClient.HttpClientBuilder();
		builder.setBody("body");
		builder.setHeaders("headers");
		builder.setMethod("get");
		builder.setUsername("username");
		builder.setPassword("password");
		HttpClient httpClient = builder.build();
		System.out.println(httpClient);
		

	}

}
