/**
 * 
 * 
 * @author >>RanaSiroosian<<
 *
 */
public class UsedCar extends Car {

	
	protected double mileage;
	
	public UsedCar(String make, String model, int year, double price, double mileage) {

		super(make, model, year, price);
		this.mileage = mileage;
	
	}

	public double getMilage() {
		return mileage;
	}

	public void setMilage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
//		return "UsedCar [mileage=" + mileage + ", make=" + make + ", model=" + model + ", year=" + year + ", price="
//				+ price + "]";
		return String.format("%-15s %-15s  %-10d  $%-10.2f   %-10.2f\n", "(Used)"+getMake(), getModel(), getYear(), getPrice(), mileage);
	}

	
	

}
