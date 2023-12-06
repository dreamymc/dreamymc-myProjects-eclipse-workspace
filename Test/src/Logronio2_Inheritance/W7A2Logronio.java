package Logronio2_Inheritance;

public class W7A2Logronio {

	public static void main(String[] args) {

		wiredMouse mouse1 = new wiredMouse();
		mouse1.setColor(mouse1.color);
		mouse1.setBrand(mouse1.brand);
		mouse1.setPrice(mouse1.price);
		System.out.printf("Mouse %s color is %s which costs %.2f", mouse1.getBrand(), mouse1.getColor(), mouse1.getPrice());
		System.out.println();
		mouse1.print();
		mouse1.scrollUp();
		System.out.println();
		
		
		bluetoothMouse mouse2 = new bluetoothMouse();
		mouse2.setColor(mouse2.color);
		mouse2.setBrand(mouse2.brand);
		mouse2.setPrice(mouse2.price);
		System.out.printf("Mouse %s color is %s which costs %.2f", mouse2.getBrand(), mouse2.getColor(), mouse2.getPrice());
		System.out.println();
		mouse2.print();
		mouse2.scrollUp();
		System.out.println();
		
		wirelessMouse mouse3 = new wirelessMouse();
		mouse3.setColor(mouse3.color);
		mouse3.setBrand(mouse3.brand);
		mouse3.setPrice(mouse3.price);
		System.out.printf("Mouse %s color is %s which costs %.2f", mouse3.getBrand(), mouse3.getColor(), mouse3.getPrice());
		System.out.println();mouse3.print();
		mouse3.scrollUp();
		System.out.println();
		

	}

}

class bluetoothMouse extends Mouse {

	protected String color = "Black";
	protected String brand = "Razer";
	protected double price = 900;
	
	void print() {
		System.out.println("Bluetooth mouse Uses internal computer and Bluetooth.");
	}
}

