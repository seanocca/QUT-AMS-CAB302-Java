package patt.Coffee;

import java.util.ArrayList;

import patt.Coffee.CoffeeFactory.Ingredient;
import patt.Coffee.CoffeeFactory.Type;

public class Coffee {
	Type type;
	double cost;
	ArrayList<Ingredient> ingredients;
	 
	public Coffee(ArrayList<Ingredient> ingredients, Type type) {
		this.type = type;

		this.ingredients = ingredients;

		double sum = 0;
		for (Ingredient ingredient : this.ingredients) {
			if (ingredient.toString() == "espresso") {
				sum += 0.5;
			} else if (ingredient.toString() == "milk") {
				sum += 1.0;
			} else if (ingredient.toString() == "chocolate") {
				sum += 1.5;
			} else {
				sum += 0;
			}
		}
		this.cost = sum;

	}

	public double getCost() {
		cost = 0.0;
		for (Ingredient ingredient : this.ingredients) {
			cost += ingredient.getCost();
		}
		return cost;
	}

	public double getPrice() {
		if (this.type.equals(Type.LONG_BLACK)) {
			return 4.0;
		} else if (this.type.equals(Type.FLAT_WHITE)) {
			return 4.75;
		} else if (this.type.equals(Type.MOCHA)) {
			return 5.5;
		}
		return 0;
	}

	public String listIngredients() {
		String string = "";
		for (Ingredient ingredient : this.ingredients) {
			string += ingredient.toString();
			string += "\n";
		}
		return string;
	}
}