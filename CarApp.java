import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		String make ="";
		String model ="";
		int carNums =0;
		int year = 0;
		double price=0.0;
		
		List<Car> cars = new ArrayList<>();
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("*************************************************\n");

		carNums = Validator.getInt(scnr, "How many cars are you entering: ");
//		scnr.nextLine();

		for (int i = 1; i <= carNums; i++) {

			System.out.println("\nPlease enter the information for car #" + i);
			System.out.println();

			make = Validator.getString(scnr, "Make: ");
			model = Validator.getString(scnr, "Model: ");
			year = Validator.getInt(scnr, "Year: ", 2000, 2020);
			price = Validator.getDouble(scnr, "Price: ", 0.0, 100000.00);
			
			Car addedCar = new Car(make, model, year, price);
			cars.add(addedCar);
		}
		System.out.println("Current Inventory:\n");


		System.out.printf("%-15s %-15s  %-10s  %-10s\n", "Make", "Model", "Year", "Price");
		System.out.println("************************************************************\n");

		for (Car car : cars) {

			System.out.println(car.toString());

		}
	}
	
}
