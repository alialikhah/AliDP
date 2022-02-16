package ir.alikhah.abstractfactory.shape;

import ir.alikhah.abstractfactory.factory.Shape;

public class RoundedSquare implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}

}
