package oop.Shapes;

public class RectangularPrism implements Shape {
	
	double vol = 0;
	double a = 0;
	double w = 0;
	double h = 0;
	double l = 0;
	
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		vol = w * h * l; 
		return vol;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		a = 2 * (w*l + h*l + h*w);
		return a;
	}

	
	RectangularPrism(double width, double height, double length){
		w = width;
		h = height;
		l = length;
	}
}
