package ir.alikhah.abstractfactory.factory;

import ir.alikhah.abstractfactory.shape.Rectangle;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	          return new Rectangle();         
	       }else	 
	       return null;
	}

}
