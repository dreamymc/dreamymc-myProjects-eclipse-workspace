import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 4 pillars of oop
		// Encapsulation - gisulod sa capsule tanan (Security)
		// methods ug variables
		// Constructor - siya dapat mu create sa object
		// pero customized
		// ADT : Abstract Data Type

//		Car myCar1 = new Car("Honda", "Civic", "Red", 1999);
//		System.out.println("My first car");
//		System.out.println(myCar1.make);
//		System.out.println(myCar1.model);
//		System.out.println(myCar1.color);
//		System.out.println(myCar1.year);
//		myCar1.Additional_Feature("Spoiler");
//		myCar1.Car_Drive();
//		
//		Car myCar2 = new Car("Chevrole", "Corvette", "Blue", 2021);
//		System.out.println("My second car (Gikan sa bag nga naay 1M$");
//		System.out.println(myCar2.make);
//		System.out.println(myCar2.model);
//		System.out.println(myCar2.color);
//		System.out.println(myCar2.year);
//		myCar2.Additional_Feature("Banyo");
//		myCar2.Car_Drive();
//		
//		Car myCar3 = new Car("Toyota", "Vios", "Black", 2021);
//		System.out.println("My third car (Gikan sa bag nga naay 1Mil)");
//		System.out.println(myCar3.make);
//		System.out.println(myCar3.model);
//		System.out.println(myCar3.color);
//		System.out.println(myCar3.year);

		// Setter and Getter occurs in encapsulation = type sa functions
		// setter void getter return
		Car myCar1 = new Car("Hyundai", "Rienna", "White", 2022);
		String model, make, Color;
		int year, passenger;

		// myCar1.setModel("Eon");

		myCar1.setMake("Toyota");
		myCar1.setYear(2020);
		myCar1.setColor("Red");

		model = myCar1.getModel();
		System.out.println(model);

		make = myCar1.getMake();
		System.out.println(make);

		year = myCar1.getYear();
		System.out.println(year);

		Color = myCar1.getColor();
		System.out.println(Color);

		// functions
		myCar1.carryPassenger(1);
		passenger = myCar1.checkNumOfPassenger();
		System.out.println("Number of passenger: " + passenger);
		myCar1.carryPassenger(5);
		passenger = myCar1.checkNumOfPassenger();
		System.out.println("Number of passenger: " + passenger);
	}

}
