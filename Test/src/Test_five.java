import java.util.Scanner;

public class Test_five {

	public static void main(String[] args) {
		calculator_fast Calculator = new calculator_fast();
		Scanner scan = new Scanner(System.in);
		System.out.print("Follow the input format of: \n10 + 10\n" + "10 - 10\n" + "10 * 10\n" + "10 / 10\nInput: ");
		try {
		String input = scan.nextLine();
		String[] array = input.split(" ");
		int num1 = Integer.parseInt(array[0]);
		String operation = array[1];
		int num2 = Integer.parseInt(array[2]);
		System.out.print("Answer is: ");
		switch (operation) {
		case "+":
			Calculator.setAdd(num1, num2);
			System.out.println(Calculator.getAdd());
			break;
		case "-":
			Calculator.setSubtract(num1, num2);
			System.out.println(Calculator.getSubtract());
			break;
		case "*":
			Calculator.setMultiply(num1, num2);
			System.out.println(Calculator.getMultiply());
			break;
		case "/":
			Calculator.setDivide(num1, num2);
			System.out.println(Calculator.getDivide());
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
		}catch(NumberFormatException e) {
			System.out.println("Enter numbers not letters bruh.");
		}

	}

}
