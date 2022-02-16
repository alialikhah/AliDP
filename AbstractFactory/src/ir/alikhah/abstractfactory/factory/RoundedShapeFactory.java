package ir.alikhah.abstractfactory.factory;

import ir.alikhah.abstractfactory.shape.RoundedRectangle;
import ir.alikhah.abstractfactory.shape.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	          return new RoundedRectangle();         
	       }else if(shapeType.equalsIgnoreCase("SQUARE")){
	          return new RoundedSquare();
	       }	 
	       return null;
	}

}
