package main;

import ir.alikhah.Factory.Shape;
import ir.alikhah.Factory.ShapeFactory;
import ir.alikhah.abstractfactory.factory.AbstractFactory;
import ir.alikhah.abstractfactory.factory.FactoryProducer;
import ir.alikhah.adaptor.adaptor.AudioPlayer;
import ir.alikhah.builder.builder.Meal;
import ir.alikhah.builder.builder.MealBuilder;
import ir.alikhah.prototype.prototype.ShapeCache;
import ir.alikhah.singletone.SingleObject;

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
	      
	      //singletone
	      
	      SingleObject object = SingleObject.getInstance();
	      object.showMessage();
	      
	      // builder
	      
	      MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " + nonVegMeal.getCost());
	      
	      
	      //prototype
	      
	      ShapeCache.loadCache();

	      ir.alikhah.prototype.prototype.Shape clonedShape = (ir.alikhah.prototype.prototype.Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      ir.alikhah.prototype.prototype.Shape clonedShape2 = (ir.alikhah.prototype.prototype.Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		

	      ir.alikhah.prototype.prototype.Shape clonedShape3 = (ir.alikhah.prototype.prototype.Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());	
	      
	      //adaptor
	      
	      AudioPlayer audioPlayer = new AudioPlayer();
	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	}

}
