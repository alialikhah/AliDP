package ir.alikhah.prototype.prototype;

import java.util.Hashtable;

import ir.alikhah.prototype.entity.Circle;
import ir.alikhah.prototype.entity.Rectangle;
import ir.alikhah.prototype.entity.Square;

public class ShapeCache {
	   private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

	   public static Shape getShape(String shapeId) {
	      Shape cachedShape = shapeMap.get(shapeId);
	      return (Shape) cachedShape.clone();
	   }

	   public static void loadCache() {
	      Circle circle = new Circle();
	      circle.setId("1");
	      shapeMap.put(circle.getId(),circle);

	      Square square = new Square();
	      square.setId("2");
	      shapeMap.put(square.getId(),square);

	      Rectangle rectangle = new Rectangle();
	      rectangle.setId("3");
	      shapeMap.put(rectangle.getId(), rectangle);
	   }
}
