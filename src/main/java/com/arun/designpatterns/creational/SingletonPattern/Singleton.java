package main.java.com.arun.designpatterns.creational.SingletonPattern;

import java.io.Serializable;

//Singleton pattern is used when we need only one instance of object to be created
// 1) Eager vs Lazy Initialization
// 2) Thread safety -> use synchronized
// 3) Serialization -> use read resolve.
// 4) When created with Reflection -> use Enum for resolving it


// Examples:  DriverManager.getConnection();



public class Singleton implements Serializable{

	
	private static Singleton instance = null;
	private Singleton() {
		
	}
	
	
	public static Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance ==null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	
	// ensures singleton is returned upon deserialization.
	public Object readResolve() {
		return instance; 
	}

}
