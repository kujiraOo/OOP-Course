package assignment6.journey;

public class Journey extends Car {

	private double d; // distance
	private double jc; // journey coefficient

	public Journey() {
		super();
		jc = 1.6;
	}

	public Journey(double pchk, double as, double d) {
		super(pchk, as);
		jc = 1.6;
		this.d = d;
	}

	private double computeConsumedPetrol() {
		return (1 - ((as - 50) / 500)) * pchk * d / 100;
	}

	private double computeConsumedPetrolCost() {
		return computeConsumedPetrol() * 1.12;
	}

	private double computeDriveCost() {
		return computeConsumedPetrolCost() * 0.24 * jc;
	}

	public String toString() {
		return super.toString() + "\nJourney distance: " + d
				+ "\nPetrol consumed: " + computeConsumedPetrol()
				+ "\nConsumed petrol cost: " + computeConsumedPetrolCost()
				+ "\nDrive cost: " + computeDriveCost();
	}

}
