package oop.Shapes;

public class Cylinder implements Shape {

	double r = 0;
	double vol = 0;
	double a = 0;
	double h = 0;
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		vol = Math.PI * Math.pow(r, 2) * h;
		return vol;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		a = (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
		return a;
	}

	Cylinder(double radius, double height){
		r = radius;
		h = height;
	}
	
}
