package Week2Topic1;

import java.io.*;
import java.util.*;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		String name;
		int age, choice;
		boolean flags = true;
		try {
			while (flags) {
				System.out.println("----------------------------------");
				System.out.print(
						"[1] Add New Vaccinated Record\n[2] View List of Vaccinated Employees\n[3] Close the program\n: ");
				choice = c.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter Name: ");
					name = s.nextLine();
					System.out.print("Enter Age: ");
					age = c.nextInt();
					System.out.print("Select the Vaccine received \n[A] for Sinovac\n[B] for Pfizer\n[C] for Astra\n: ");
					String vaccine;
					vaccine = s.next();
					if (vaccine.equalsIgnoreCase("a")) {
						vaccine = "Sinovac";
					} else if (vaccine.equalsIgnoreCase("b")) {
						vaccine = "Pfizer";
					} else if (vaccine.equalsIgnoreCase("c")) {
						vaccine = "Astra";
					} else {
						System.out.println("Not in the list.");
						main(args);
					}
					FileWriter writer = new FileWriter("store.txt", true);
					writer.write(name + " " + age + " " + vaccine + '\n');
					writer.close();
					System.out.println("You successfully added a Record! ");
					break;
				case 2:
					try {
						Scanner reader = new Scanner(new FileReader("store.txt"));
						int counter = 1;
						while (reader.hasNext()) {
							name = reader.next();
							age = reader.nextInt();
							vaccine = reader.next();

							System.out.println("\n----Employee #" + counter + "----");
							System.out.println("First Name: " + name);
							System.out.println("Age: " + age);
							System.out.println("Vaccine: " + vaccine);

							counter++;
						}
						reader.close();

					} catch (FileNotFoundException e) {
						System.out.println("File not found.");
					}
					break;
				case 3:
					System.out.println("Program Closed.");
					flags = false;
					break;

				}

			}
		} catch (Exception a) {
			System.out.println("hey you're wrong");
		}
	}

}