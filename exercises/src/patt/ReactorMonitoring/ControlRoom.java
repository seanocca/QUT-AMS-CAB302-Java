package patt.ReactorMonitoring;

import java.util.Observable;
import java.util.Observer;

public class ControlRoom extends RadiationMonitor {
	
	private double warningThreshold;
	private Double radiation;

	/**
	 * Constructs a ControlRoom object, which observes reactor radiation readings
	 * and prints reports if the radiation exceeds a threshold.
	 * 
	 * @param location.
	 *            An arbitrary location.
	 * @param warningThreshold.
	 *            The radiation threshold for when reports should be printed.
	 */
	public ControlRoom(String location, double warningThreshold) {
		super(location);
		this.warningThreshold = warningThreshold;
		
	}

	/**
	 * Updates the monitor with a new observation and prints a report if and only if
	 * the observation is equal to or greater than the warning threshold.
	 */
	public void update(Observable subject, Object o) {	
		radiation = (double)o;
		if (radiation >= warningThreshold) {
			subject.notifyObservers(o);
			System.out.println(this.generateReport());
		}
		
	}

	/**
	 * Generates a report based on the current observation.
	 */
	@Override
	public String generateReport() {
		String report = now() + " :: WARNING :: " + String.format("%.4f", radiation) + " :: " + getLocation();
		return report;
	}

}