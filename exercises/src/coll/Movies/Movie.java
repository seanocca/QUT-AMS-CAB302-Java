package coll.Movies;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String title;
	private int year;
	private List<Integer> ratings;

	// Constructor
	public Movie(String title, int year) {		 
		ratings = new ArrayList<Integer>();
		this.title = title;
		this.year = year;		
	}

	// Rate the movie
	public void addRating(int rating) {
		ratings.add(rating);
	}

	// Get the title of the movie
	public String title() {
		return this.title;
	}

	// Get the year of the movie
	public int year() {
		return this.year;
	}

	// Get the average rating of the movie
	public double rating() {
		
		double aveRating = 0.0;
		
		if (!ratings.isEmpty()) {
			for (double rating: ratings) {
				aveRating += rating;
			}
		}
		
		aveRating = aveRating / ratings.size();
		return aveRating;
	}

}