package oop.Shapes;

public class Sphere implements Shape {
	
	double r = 0;
	double vol = 0;
	double a = 0;
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		vol = (4.0/3.0) * Math.PI * Math.pow(r, 3);
		return vol;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		a = 4 * Math.PI * Math.pow(r, 2);
		return a;
	}

	Sphere(double radius) {
		r = radius;
	}
}
