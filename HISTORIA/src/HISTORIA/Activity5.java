package HISTORIA;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String[] inputArray;
		double number1;
		String operation;
		double number2;
		System.out.println("[+] Addition");
		System.out.println("[-] Subtraction");
		System.out.println("[*] Multiplication");
		System.out.println("[/] Division");
		System.out.println(
				"In one line, input the first number, the operation, and the second number each one being separated by spaces.");
		while (true) {
			System.out.print("Enter what you want to calculate: ");
			try {
				input = sc.nextLine();
				inputArray = input.split(" ");
				operation = inputArray[1];
				number1 = Double.parseDouble(inputArray[0]);
				number2 = Double.parseDouble(inputArray[2]);

				try {
					switch (operation) {

					case "+":
						System.out.println(number1 + number2);
						break;

					case "-":
						System.out.println(number1 - number2);
						break;

					case "*":
						System.out.println(number1 * number2);
						break;

					case "/":
						System.out.println(number1 / number2);
						break;

					}

				} catch (Exception error) {
					System.out.println("Number cannot be divided by zero");
				}
			} catch (Exception error) {
				System.out.println("Invalid Input, pls re-run the program. ");
			}
// while end
		}
	}

}
	