import java.util.Scanner;

public class MorseCodeTranslator {

	public static void main(String[] args) {
		// MORSE CODE CONVERTER
		menu_Start();
	}// end of main

	public static void menu_Start() {
		Scanner input = new Scanner(System.in);
		int choice;
		try {
			System.out.print("===Morse Code Converter===\n" + "[1] Word to Morse Code\n" + "[2] Morse Code to Word\n"
					+ "[3] Exit\n" + "enter here: ");
			choice = input.nextInt();
			menu(choice);
		} catch (Exception e) {
			System.out.println("Invalid Input.Try again");
		}
	}

	public static void menu_End() {
		Scanner input = new Scanner(System.in);
		int select;
		System.out.print("Converted Sucessfully\n" + "[1] Restart\n" + "[2] Exit\n" + "Type here: ");
		select = input.nextInt();
		switch (select) {
		case 1: {
			menu_Start();
			break;
		}
		case 2:
			System.out.println("Program Closed.");
		}
	}

	public static int menu(int choice) {
		boolean proceed = true;
		do {
			switch (choice) {
			case 1: {
				alphabet_conv();
				break;
			}
			case 2: {
				morse_conv();
				break;
			}
			case 3: {
				System.out.println("Program Closed.");
				proceed = false;
				break;
			}
			default:
				System.out.println("Invalid input");
			}
			return choice;
		} while (proceed);
	}

	public static String alphabet_conv() {
		System.out.println("Word to Morse Code");
		Scanner input = new Scanner(System.in);
		String letter = "";
		String morseAlpha[][] = { { "A", "·−" }, { "B", "−···" }, { "C", "−·−·" }, { "D", "−··" }, { "E", "·" },
				{ "F", "··−·" }, { "G", "−−·" }, { "H", "····" }, { "I", "··" }, { "J", "·−−−" }, { "K", "−·−" },
				{ "L", "·−··" }, { "M", "−−" }, { "N", "−·" }, { "O", "−−−" }, { "P", "·−−·" }, { "Q", "−−·−" },
				{ "R", "·−·" }, { "S", "···" }, { "T", "−" }, { "U", "··−" }, { "V", "···−" }, { "W", "·−−" },
				{ "X", "−··−" }, { "Y", "−·−−" }, { "Z", "−−··" }, { " ", "‎" } };
		System.out.println("type to convert: ");
		String alphaInp = input.nextLine();
		String[] letters = alphaInp.split(""); //array
		int row, col;
		String charAlpha = "";
		for (int x = 0; x < letters.length; x++) {
			charAlpha = letters[x];
			for (row = 0; row < morseAlpha.length; row++) {
				for (col = 0; col < morseAlpha[row].length; col++) {
					if (morseAlpha[row][col].equalsIgnoreCase(charAlpha)) {
						System.out.print(morseAlpha[row][col + 1]);
						System.out.print(" ");
					}
				}
			}
		}
		System.out.println();
		menu_End();
		return letter;
	}

	public static String morse_conv() {
		System.out.println("Morse Code to letter");
		Scanner input = new Scanner(System.in);
		String morse = "";
		String morseCode[][] = { { "·−", "A" }, { "−···", "B" }, { "−·−·", "C" }, { "−··", "D" }, { "·", "E" },
				{ "··−·", "F" }, { "−−·", "G" }, { "····", "H" }, { "··", "I" }, { "·−−−", "J" }, { "−·−", "K" },
				{ "·−··", "L" }, { "−−", "M" }, { "−·", "N" }, { "−−−", "O" }, { "·−−·", "P" }, { "−−·−", "Q" },
				{ "·−·", "R" }, { "···", "S" }, { "−", "T" }, { "··−", "U" }, { "···−", "V" }, { "·−−", "W" },
				{ "−··−", "X" }, { "−·−−", "Y" }, { "−−··", "Z" }, { "/", "‎ " } };
		System.out.println("separate every code and spaces by '/'\n" + "(a/b/c/ /e/f/g = ·−/−···/−·−·/ /·/··−·/−−·)\n"
				+ "type to convert: ");
		String morseInp = input.nextLine();
		String[] morses = morseInp.split(" ");
		int row, col;
		String charMorse = "";
		for (int x = 0; x < morses.length; x++) {
			charMorse = morses[x];
			for (row = 0; row < morseCode.length; row++) {
				for (col = 0; col < 2; col++) {
					if (morseCode[row][col].equalsIgnoreCase(charMorse)) {
						System.out.print(morseCode[row][col + 1]);
					}
				}
			}
		}
		System.out.println();
		menu_End();
		;
		return morse;
	}
}// end of class