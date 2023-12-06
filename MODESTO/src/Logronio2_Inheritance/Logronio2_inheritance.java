package Logronio2_Inheritance;

public class Logronio2_inheritance {

	public static void main(String[] args) {
		Car car = new Car();
		car.display();
		System.out.println();
		Motorcycles motor = new Motorcycles();
		motor.display();

	}

}

class Motorcycles extends Logronio2_inheritance {

	protected String Make = "Suzuki";
	protected String Model = "Raider FI";
	protected int Year = 2022;

	void display() {
		System.out.println("The brand of the Motorcycle is " + Make);

		System.out.println("The model of the Motorcycle is " + Model);

		System.out.println("The model year of the Motorcycle is " + Year);

	}
}

class Car extends Logronio2_inheritance {

	protected String Make = "Ford";
	protected String Model = "F150TEN";
	protected int Year = 2023;

	void display() {
		System.out.printf("The brand of the car is %s.\n", Make);
		System.out.printf("The Model of the car is %s.\n", Model);
		System.out.printf("The model year of the car is %d.\n", Year);

	}

}
