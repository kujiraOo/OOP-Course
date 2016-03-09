package journey;

public class Car {

	// petrol consumtion per 100km, average speed
	protected double pchk, as; 

	public Car() {

	}
	
	public Car(double pchk, double as) {
		this.pchk = pchk;
		this.as = as;
	}
	
	public String toString() {
		return "Petrol consumption per 100km:  " + pchk + "\nAverage speed: " + as;
	}

}
