package oop.Shapes;

public class ShapeHandler {
	// Returns the sum of the volumes of the given shapes.
	public static double volumeSum(Shape[] shapes) {
		double tot = 0;
		for (int i = 0; i < shapes.length; i++) {
			tot += shapes[i].volume();
		}
		return tot;
	}

	// Returns the sum of the surface areas of the given shapes.
	public static double surfaceAreaSum(Shape[] shapes) {
		double tot = 0;
		for (int i = 0; i < shapes.length; i++) {
			tot += shapes[i].surfaceArea();
		}
		return tot;
	}
}