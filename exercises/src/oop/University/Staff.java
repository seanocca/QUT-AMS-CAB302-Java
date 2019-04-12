package oop.University;

public class Staff extends Academic {

	private double tuteSalary = 40.00;
	private int hoursWorked = 0;
		
	public Staff(String name, int id, Title title) {
		super(name, id, title);
		// TODO Auto-generated constructor stub
	}
	
	public void setHours(int hours) {
		hoursWorked = hours;
	}
	
	@Override
	public double getWeeklyPay() {
		// TODO Auto-generated method stub
		double salary = 0;
		if (this.getTitle().toString() == "lecturer.") {
			salary = 80000.0 / 52.0;
		} else if (this.getTitle().toString() == "tutor.") {
			salary = hoursWorked * tuteSalary;
		}
		return salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Staff "+ this.getID() + " works as a " + this.getTitle();
		return s;
	}	
}
