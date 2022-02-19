package ir.alikhah.prototype.entity;

import ir.alikhah.prototype.prototype.Shape;

public class Rectangle extends Shape{
	   public Rectangle(){
		     type = "Rectangle";
		   }

		   @Override
		   public void draw() {
		      System.out.println("Inside Rectangle::draw() method.");
		   }

}
