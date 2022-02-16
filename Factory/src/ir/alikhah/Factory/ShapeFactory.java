package ir.alikhah.Factory;

import ir.alikhah.shape.Circle;
import ir.alikhah.shape.Rectangle;
import ir.alikhah.shape.Square;

public class ShapeFactory {
	   public Shape getShape(String shapeType){
		      if(shapeType == null){
		         return null;
		      }		
		      if(shapeType.equalsIgnoreCase("دایره")){
			         return new Circle();
			         
			      } else if(shapeType.equalsIgnoreCase("مثلث")){
			         return new Rectangle();
			         
			      } else if(shapeType.equalsIgnoreCase("مربع")){
			         return new Square();
			      }
		      
		      return null;
		   }
}
