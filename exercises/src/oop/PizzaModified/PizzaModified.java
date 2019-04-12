package oop.PizzaModified;

public class PizzaModified {
	// Private properties
	private int price;
	private String type;
	
	// Constructs a Pizza object with a price and a type
	public PizzaModified(PizzaType type) {
		this.type = type.toString();
		this.price = type.price();
	}

	// Gets the price of the pizza
	public int price() {
		return price;
	}

	// Gets the type of the pizza
	public String type() {
		return type;
	}
}