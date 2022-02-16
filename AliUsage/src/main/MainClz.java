package main;

import ir.alikhah.Factory.Shape;
import ir.alikhah.Factory.ShapeFactory;
import ir.alikhah.abstractfactory.factory.AbstractFactory;
import ir.alikhah.abstractfactory.factory.FactoryProducer;

public class MainClz {

	public static void main(String[] args) {
		  //factory
	      ShapeFactory shapeFactory = new ShapeFactory();

	      Shape shape1 = shapeFactory.getShape("دایره");
	      shape1.draw();
	      Shape shape2 = shapeFactory.getShape("مثلث");
	      shape2.draw();
	      Shape shape3 = shapeFactory.getShape("مربع");
	      shape3.draw();
	      
	      //abstract factory
	      
	      AbstractFactory absshapeFactory = FactoryProducer.getFactory(false);
	      ir.alikhah.abstractfactory.factory.Shape shape11 = absshapeFactory.getShape("RECTANGLE");
	      shape11.draw();
          AbstractFactory absshapeFactory1 = FactoryProducer.getFactory(true);
	      ir.alikhah.abstractfactory.factory.Shape shape31 = absshapeFactory1.getShape("RECTANGLE");
	      shape31.draw();
	      ir.alikhah.abstractfactory.factory.Shape shape41 = absshapeFactory1.getShape("SQUARE");
	      shape41.draw();
	}

}
