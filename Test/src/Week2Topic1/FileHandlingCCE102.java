package Week2Topic1;

import java.io.*;
import java.util.*;

public class FileHandlingCCE102 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner reader = new Scanner(new FileReader("store.txt"));
		String name;
		int age;
		int counter = 1;
		while (reader.hasNext()) {
			name = reader.next();
			age = reader.nextInt();

			System.out.println("\n----Student #" + counter + "----");
			System.out.println("First Name: " + name);
			System.out.println("Age: " + age);

			counter++;
		}
		reader.close();
	}

}
