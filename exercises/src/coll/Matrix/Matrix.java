package coll.Matrix;

import java.util.*;

public class Matrix<T> implements Iterable {
	
	int rows;
	int columns;
	
	protected T thingy;

	private T[][] matrix;
	/**
	 * Construct a Matrix object.
	 * 
	 * @param rows. An int that specifies the number of rows.
	 * @param columns. An int that specifies the number of columns.
	 */
	@SuppressWarnings("unchecked")
	public Matrix(int rows, int columns) {
		matrix = (T[][]) new Object[rows][columns];
		this.rows = rows;
		this.columns = columns;

	}

	/**
	 * Assigns a value to a given cell, specified by its row, column coordinates.
	 * 
	 * @param row. An int for the row index with 0-based indexing.
	 * @param column. An int for the column index with 0-based indexing.
	 * @param value. A generic value to be assigned to the given cell.
	 */
	public void insert(int row, int column, T value) {
		matrix[row][column] = value;
	}

	/**
	 * Gets the value at a given cell, specified by its row, column coordinates.
	 * @param row. An int for the row index with 0-based indexing.
	 * @param column. An int for the column index with 0-based indexing.
	 * @return value. A generic value located at the given cell.
	 */
	public Object get(int row, int column ) {
		return matrix[row][column];
	}

	/**
	 * Gets the total number of cells in the matrix.
	 * @return an int equal to the total number of cells in the matrix.
	 */
	public int size() {
		return (rows) * (columns);
	}
	
	/**
	 * Converts the matrix to String format.
	 * @return a String representation of the matrix.
	 */
	public String toString() {
		String stringedMatrix = "";
		for (int rowing = 0; rowing < rows; rowing++) {
			for (int columning = 0; columning < columns; columning++ ) {
				stringedMatrix += matrix[rowing][columning].toString();
				if (columning == columns - 1) {
					stringedMatrix += "\n";					
				}else {
					stringedMatrix += "\t";
				}
			}	
			
		}
		return stringedMatrix;
	}

	/**
	 * Returns an Iterator object for the matrix. The Iterator should follow the
	 * order of row by row. Within each row the order is left to right.
	 * @return an Iterator object for the matrix.
	 */
	public Iterator<T> iterator() {
		ArrayList<T> newone = new ArrayList<T>();
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < columns; y++) {
				newone.add(matrix[x][y]);
			}
		}
		
		Iterator<T> iter = newone.iterator();
		
		return iter;
	}

}