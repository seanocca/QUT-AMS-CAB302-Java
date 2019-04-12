package oop.University;

public class Student extends Academic {

	private double stipend;
	
	public Student(String name, int id, Title title, double stipend) {
		super(name, id, title);
		// TODO Auto-generated constructor stub
		this.stipend = stipend;
	}
	
	@Override
	public double getWeeklyPay() {
		// TODO Auto-generated method stub
		return stipend;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Student "+ this.getID() + " studies a " + this.getTitle();
		return s;
	}
}
