import java.util.Scanner;
public class Car {
static Scanner sc = new Scanner(System.in);
	private String make;
	private String model;
	private String color;
	private int year, passenger;

	public Car(String make, String model, String color, int year) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	void Additional_Feature(String feature) {
		System.out.println("This car added a feature of: " + feature);
	}

	void Car_Drive() {
		System.out.println("This car is driving");
	}

	void Car_Stop() {
		System.out.println("This car has stopped");
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setColor(String color) {
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void carryPassenger(int passenger) {
		if (passenger < 6) {
			this.passenger += passenger;
		} else
			System.out.println("Error");
	}

	public int checkNumOfPassenger() {
		return passenger;
	}
}
