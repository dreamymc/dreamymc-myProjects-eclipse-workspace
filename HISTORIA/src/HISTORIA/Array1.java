package HISTORIA;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			String[] names = { "Melvz", "Pablo", "Bernard", "Jude", "Cardo", "Yoj", "Noah", "Hey" };
			System.out.print("Enter username: ");
			String name = scan.nextLine();
			boolean flag1 = true;
			for (int x = 0; x <= 7; x++) {
				if (name.equalsIgnoreCase(names[x])) {
					System.out.println("Name: " + names[x] + " found at index " + x);
					flag1 = false;
				}

			}
			if (flag1==true) {
				System.out.println(name + " is not found.");
			}


		} catch (Exception e) {
			System.out.println("damnation");
		}

	}
}