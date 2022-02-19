package ir.alikhah.prototype.entity;

import ir.alikhah.prototype.prototype.Shape;

public class Circle extends Shape{
	   public Circle(){
		     type = "Circle";
		   }

		   @Override
		   public void draw() {
		      System.out.println("Inside Circle::draw() method.");
		   }
}
