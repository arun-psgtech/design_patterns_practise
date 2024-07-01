package main.java.com.arun.designpatterns.structural.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private Map<String, Shape> shapeMap = new HashMap<>();
	
	public Shape getShape(String type) {
		if(shapeMap.get(type)==null) {
			
			if(type=="circle") {
				shapeMap.put("circle", new Circle());
			}
			if(type=="rectangle") {
				shapeMap.put("rectangle", new Rectangle());
			}
		}
		return shapeMap.get(type);
	}
}
