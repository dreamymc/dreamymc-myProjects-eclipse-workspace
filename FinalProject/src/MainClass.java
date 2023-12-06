import javax.swing.*;
import java.text.DecimalFormat;

public class MainClass {

	
	static DecimalFormat df = new DecimalFormat("###.##");
	public static double Discount(double price, double discount) {
		double price_discounted = price - discount;
		return price_discounted;
	}
	public static double Transaction(double payment, double price_discounted) {
		double total = payment - price_discounted;
		return total;
	}	
	public static void Info(String name, String occupation) {
		JOptionPane.showInternalMessageDialog(null, "Welcome " + name + ", " + "so you will be having a " + occupation + 
				"'s discount.", "Logorn's Burger", JOptionPane.PLAIN_MESSAGE);
	}
	public static void Not_Enough(String name) {
		JOptionPane.showMessageDialog(null, name + ", your payment is not enough. \nPlease restart the transaction.");
	}
	public static void Thankyou(String name) {
		JOptionPane.showMessageDialog(null,
				"Thank you for ordering in Logorn's Burger "+ name + "!\nProceed to the counter and enjoy your burger.",
				"Logorn's Burger", JOptionPane.PLAIN_MESSAGE);
	}
	public static void Order(String order, double payment, double price_discounted) {
		JOptionPane.showMessageDialog(null, "You entered $"+ payment + "\nThank you for ordering " + order + "\nYour change is $" + df.format(Transaction(payment, price_discounted)),
				"Logorn's Burger", JOptionPane.PLAIN_MESSAGE);
	}
	public static double occupation_Discount (String occupation, double price) {
		if (occupation.equalsIgnoreCase("Worker")) {
			double discount = (price * 0.05);
			return discount;
		} else if (occupation.equalsIgnoreCase("Student")) {
			double discount = (price * 0.1);
			return discount;
		} else if (occupation.equalsIgnoreCase("Senior")) {
			double discount = (price * 0.15);
			return discount;
		} else if (occupation.equalsIgnoreCase("Kiddie")) {
			double discount = (price * 0.4);
			return discount;
		}else {
			double discount = price*0;
			return discount;
		}
	}
	public static void main(String[] McBernard) {
		double payment, discount = 0, price_discounted;
		double[] order_price= { 1.5, 2, 2.8, 3.5, 3.69 };
		String name, occupation, order;
		double price;
		boolean flag=true;
		do {
			name = JOptionPane.showInputDialog(null, "Enter your name:", "Logorn's Burger", JOptionPane.PLAIN_MESSAGE);
		}while(name.equals(""));
		do {
			occupation = JOptionPane.showInputDialog(null, "Enter your occupation: \n(Worker, Kiddie, Student, Senior)\n",
					"Logorn's Burger", JOptionPane.PLAIN_MESSAGE);
		}while(occupation.equals(""));
		Info(name, occupation);
		String[] C_orders = { "Normal Logorn's Burger for $" + order_price[0], "Cheese Logorn's Burger for $" + 
				order_price[1], "Double Logorn's Burger for $" + order_price[2], "Double Cheese Logorn's Burger for $" + order_price[3] + 
				" which is a blast!",  "Double Logorn's Bacon Burger for $" + order_price[4]};
		String [] Orders = { "C1", "C2", "C3", "C4", "C5" };
		do {
		order = JOptionPane.showInputDialog(null,
				"C1 = " + C_orders[0] + "\n\n" + "C2 = " + C_orders[1] + "\n\nC3 = " + C_orders[2] + "\n\nC4 = " + C_orders[3] + "\n\nC5 = " + C_orders[4],
				"Enter your Logorn's Burger Order", JOptionPane.PLAIN_MESSAGE);
		}while(!((order.equalsIgnoreCase("C1")) || (order.equalsIgnoreCase("C2")) || (order.equalsIgnoreCase("C3")) || (order.equalsIgnoreCase("C4")) || (order.equalsIgnoreCase("C5"))) );
		for (int i=0; i<6; i++) {
			if (order.equalsIgnoreCase(Orders[i])) {
				price = order_price[i];
				discount = occupation_Discount(occupation, price);
				price_discounted = Discount(price, discount);
				payment = Double.parseDouble(
						JOptionPane.showInputDialog(null, "You entered "+ Orders[i]+ " " + C_orders[i] + " with your "+ occupation + "'s discount of $" + 
				df.format(discount)+" less." + "\nYour total payment is $"+df.format(price_discounted) + "\nPlease enter your payment below: ", "Logorn's Burger", JOptionPane.PLAIN_MESSAGE));
				flag = false;
				if (payment < price_discounted) {
					Not_Enough(name);
					break;
				} else {
					Order(C_orders[i], payment, price_discounted);
					Thankyou(name);
					break;
				}
			}
		}
		if(flag==true) {
			JOptionPane.showMessageDialog(null, "Invalid Input. \nPlease try again. ", "Logorn's Burger", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
