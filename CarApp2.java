import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner (System.in);
		
		extracted(scnr);
		
		
	}

	private static void extracted(Scanner scnr) {
		Car car1 = new Car ("Jeep", "Compass", 2017, 18195.36 );
		Car car2 = new Car ("Honda", "Civic", 2015, 11000.00);
		Car car3 = new Car ("Ford", "Mustang", 2017, 32325.85);
		Car car4 = new UsedCar ("Jeep", "Grand Cherokee", 2019, 35319.25,35987.6);
		Car car5 = new UsedCar ("Porsche", "Cayenne", 2014, 21000.00,12345.0);
		Car car6 = new UsedCar ("Chevrolet", "Corvette", 2008, 25675.36,35987.6);
		
		List<Car> moreCars = new ArrayList<>();
		
		moreCars.add(car1);
		moreCars.add(car2);
		moreCars.add(car3);
		moreCars.add(car4);
		moreCars.add(car5);
		moreCars.add(car6);
		
		

		System.out.println("\t\t\t\tInventory: \n");

		System.out.printf("   %-15s %-15s  %-10s  %-10s   %-10s\n", "Make", "Model", "Year", "Price", "Mileage");

		System.out.println("************************************************************************\n");

		
		for (Car cars : moreCars) {
			int i = moreCars.indexOf(cars)+1;
			if (cars instanceof UsedCar) {
				System.out.println(i + "  " + ((UsedCar) cars).toString());
			} else {
				System.out.println(i + "  " + cars.toString());
			}
			i++;
		}
		System.out.println("" + (moreCars.size()+1) + " Quit");
		int sum = 0;
		boolean loop = false;
		double[] customerCart ;

		do {
			int choice = 0;
			choice = Validator.getInt(scnr, "\nWhich car would you like? " , 1, moreCars.size()+1);
				if(choice  == moreCars.size()+1) {
					break;
				}
			System.out.println();
			System.out.println(moreCars.get(choice-1));
			System.out.println("\nWould you like to buy this car?");
//			scnr.nextLine();
			String yesOrNo = scnr.nextLine();
		
			if (yesOrNo.equalsIgnoreCase("y")) {
				System.out.println("Excellent! Our finance department will be in touch shortly.\n");
				
				moreCars.remove(choice-1);		
			}
			else {
				System.out.println("Have a great day!");
			}
			System.out.println("Would you like to buy another car? ");
			yesOrNo = scnr.nextLine();
			if(yesOrNo.equalsIgnoreCase("n")) {
				loop = false;
				break;
			}
			if(yesOrNo.equalsIgnoreCase("y")) {
				for (Car cars : moreCars) {
					int i = moreCars.indexOf(cars)+1;
					if (cars instanceof UsedCar) {
						System.out.println(i + "  " + ((UsedCar) cars).toString());
					} else {
						System.out.println(i + "  " + cars.toString());
					}
					i++;
				}
				System.out.println("" + (moreCars.size()+1) + " Quit");
				loop = true;
			}
		}while (loop);
		
		System.out.println("Have a great day!");
		scnr.close();
	}
		
}


