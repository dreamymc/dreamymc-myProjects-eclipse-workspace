package Week2Topic1;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Act7Writer {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		String name, gender, birthday, contact;
		int age;
		System.out.print("Enter Name: ");
		name = console.nextLine();
		System.out.print("Enter Birthday: ");
		birthday = console.nextLine();
		System.out.print("Enter Gender: ");
		gender = console.nextLine();
		System.out.print("Enter Age: ");
		age = num.nextInt();
		System.out.print("Enter Contact Number: ");
		contact = num.next();

		FileWriter wtr = new FileWriter("phonebook.txt", true);
		wtr.write(name + " " + birthday + " " + gender + " " + age + " " + contact + '\n');
		wtr.close();

		System.out.println("Added successfully!");
		System.out.println("Run the program again to add another record.");
	}
}