package Logronio2_Inheritance;

public class wirelessMouse extends Mouse {

	protected String color = "Green";
	protected String brand = "Logitech ";
	protected double price = 500;
	
	void print() {
		System.out.println("Wired mouse uses radio signal.");
	}
}
