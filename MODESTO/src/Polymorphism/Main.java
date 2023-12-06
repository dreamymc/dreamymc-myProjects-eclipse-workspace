package Polymorphism;

public class Main {

	//Polymorphism = The ability of an object to identify as more than one type
	public static void main(String[] args) {
		Car car = new Car();
		Motorcycle motor = new Motorcycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car, motor, boat};
		 
		for(Vehicle a : racers) {
			a.go();
		}

	}

}
