package patt.Coffee;

import java.util.ArrayList;

public class CoffeeFactory {

	public static enum Type {
		LONG_BLACK(4.0),
		FLAT_WHITE(4.75),
		MOCHA(5.5);

		private double price;

		Type(double price) {
			this.price = price;
		}

		public double getPrice() {
			return price;
		}
	}

	public static enum Ingredient {
		ESPRESSO(0.5),
		MILK(1),
		CHOCOLATE(1.5);

		private double cost;

		Ingredient(double cost) {
			this.cost = cost;
		}

		public double getCost() {
			return cost;
		}
	}
	
	public static Coffee CreateCoffee(Type type) {
		ArrayList<Ingredient> ing = new ArrayList<Ingredient>();
		Coffee cup;
		switch (type) {
	        case LONG_BLACK: 
	        		ing.add(Ingredient.ESPRESSO);
	        		ing.add(Ingredient.ESPRESSO);
	        		cup = new Coffee(ing, Type.LONG_BLACK);
	                 break;
	        case FLAT_WHITE: 
		        	ing.add(Ingredient.ESPRESSO);
	        		ing.add(Ingredient.MILK);
	        		cup = new Coffee(ing, Type.FLAT_WHITE);
	                 break;
	        case MOCHA:  
		        	ing.add(Ingredient.ESPRESSO);
	        		ing.add(Ingredient.MILK);
	        		ing.add(Ingredient.CHOCOLATE);
	        		cup = new Coffee(ing, Type.MOCHA);
	                 break;
	         default:
	        	ing.add(Ingredient.ESPRESSO);
	        	ing.add(Ingredient.ESPRESSO);
	        	cup = new Coffee(ing, Type.LONG_BLACK);
	        	  break;
	    }
		return cup;
	}
}
