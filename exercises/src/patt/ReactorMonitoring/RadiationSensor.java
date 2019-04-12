package patt.ReactorMonitoring;

import java.util.Observable;
import java.util.Random;

public class RadiationSensor extends Observable {

	private String location;
	private Random rn;
	private Double radiation;
	/**
	 * Constructs a RadiationSensor object
	 * 
	 * @param location.
	 *            An arbitrary location.
	 * @param seed.
	 *            A seed for the random number generator used to simulate radiation
	 *            readings.
	 */
	public RadiationSensor(String location, int seed) {
		this.location = location;
		rn = new Random(seed);
	}

	/**
	 * Gets the location
	 * 
	 * @return location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Gets the radiation
	 * 
	 * @return radiation
	 */
	public double getRadiation() {
		if (radiation == null) {
			radiation = 0.000;
		}
		return (double)radiation;
		
	}

	/**
	 * Updates radiation, changes the state to true, and notifies all observers of
	 * the change.
	 */
	public void readRadiation() {
		radiation = rn.nextDouble() * 10; 
		this.setChanged();
		this.notifyObservers(getRadiation());
	}

}