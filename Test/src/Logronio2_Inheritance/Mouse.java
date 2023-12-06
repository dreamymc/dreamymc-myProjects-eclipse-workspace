package Logronio2_Inheritance;

public class Mouse {

	private String color;
	private String brand;
	private double price;

	String getColor() {
		return color;
	}

	String getBrand() {
		return brand;
	}

	double getPrice() {
		return price;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setPrice(double price) {
		this.price = price;
	}

	protected void scrollUp() {
		System.out.println("Scrolling up");
		System.out.println(getColor());

	}

	protected void scrollDown() {
		System.out.println("Scrolling down");
	}

	protected void rightClick() {
		System.out.println("You pressed right click.");
	}

	protected void leftClick() {
		System.out.println("You pressed left click.");
	}

}
