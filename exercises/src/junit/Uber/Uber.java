package junit.Uber;

public class Uber{

	private String driverName;
	private String carModel;
	
	public static double currFareRate;
	private double surgeMultiplier = 1.0;
	
	public Uber(String driverName, String carModel) {
		this.driverName = driverName;
		this.carModel = carModel;
	}
	
	public String getDriverName() {
		return driverName;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public static void setFareRate(double fareRate) {
		currFareRate = fareRate;
	}
	
	public static double getFareRate() {
		return currFareRate;
	}
	
	public void pickupPassenger() {
		
	}
	
	public double setdownPassenger() {
		return currFareRate * this.surgeMultiplier;
	}
	
	public void setSurgeMultiplier(double surgeMultiplier) {
		this.surgeMultiplier = surgeMultiplier;
	}

}
