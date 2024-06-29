package main.java.com.arun.designpatterns.creational.SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton);
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
		
		
		try {
			Constructor<?> constructor = Singleton.class.getDeclaredConstructors()[0];
			constructor.setAccessible(true);
			Singleton newInstance = (Singleton)constructor.newInstance();
			System.out.println(newInstance);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SingletonEnum.INSTANCE.displayData();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
		out.writeObject(singleton);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
		Singleton s3 =  (Singleton)in.readObject();
		in.close();
		
		System.out.println(s3);
		
		
	}

}
