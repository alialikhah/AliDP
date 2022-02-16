package ir.alikhah.abstractfactory.shape;

import ir.alikhah.abstractfactory.factory.Shape;

public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		 System.out.println("Inside RoundedRectangle::draw() method.");
	}

}
