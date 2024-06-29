package main.java.com.arun.designpatterns.creational.BuilderPattern;

public class HttpClient {
	
	String url;
	String username;
	String password;
	String method;
	String headers;
	String body;
	
	HttpClient(HttpClientBuilder builder) {
		this.url = builder.url;
		this.username = builder.username;
		this.password = builder.password;
		this.method = builder.method;
		this.headers = builder.headers;
		this.body = builder.body;
	}
	
	public static class HttpClientBuilder {
		String url;
		String username;
		String password;
		String method;
		String headers;
		String body;
		
		public HttpClientBuilder setUrl(String url) {
			this.url = url;
			return this;
		}
		
		public HttpClientBuilder setUsername(String username) {
			this.username = username;
			return this;
		}
		
		public HttpClientBuilder setPassword(String password) {
			this.password = password;
			return this;
		}
		
		public HttpClientBuilder setMethod(String method) {
			this.method = method;
			return this;
		}
		
		public HttpClientBuilder setHeaders(String headers) {
			this.headers = headers;
			return this;
		}
		
		public HttpClientBuilder setBody(String body) {
			this.body = body;
			return this;
		}
		
		public HttpClient build() {
			return new HttpClient(this);
		}
		
		
		
	}
	

}
