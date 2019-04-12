package patt.ReactorMonitoring;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Observable;

public class ResearchCentre extends RadiationMonitor {

	private ArrayList<Double> observations = new ArrayList<Double>();
	/**
	 * Constructs a ResearchCentre object, which observes reactor radiation readings
	 * and constantly prints a report with the current moving average of the
	 * recorded observations.
	 * 
	 * @param location.
	 *            An arbitrary location.
	 */
	public ResearchCentre(String location) {
		super(location);
	}

	/**
	 * Updates the monitor with a new observation and prints a report.
	 */
	public void update(Observable subject, Object o) {
		observations.add((double)o);
		subject.notifyObservers(o);
		System.out.println(this.generateReport());	
	}

	/**
	 * Generates a report of the current moving average, updated by a new
	 * observation. The moving average is calculated by summing all observations
	 * made so far, and dividing by the quantity of observations so far.
	 */
	public String generateReport() {
		double movingAverage = 0;
		String report;
		if (observations.isEmpty()) {
			report = now() + " :: " + "moving average :: 0.0000 :: " + getLocation();
		} else {
			for (double value : observations) {
				movingAverage += value;
			}
			double radiationAverage = movingAverage / observations.size();
			
			DecimalFormat decimalFormat = new DecimalFormat("#.0000");
			
			report = now() + " :: moving average :: " + decimalFormat.format(radiationAverage) + " :: " + getLocation();
		}
		return report;
	}
}