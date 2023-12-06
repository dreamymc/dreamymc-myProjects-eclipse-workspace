package test;

import java.util.Random;

public class leetAddTwoNumbers {

	public static void main(String[] args) throws InterruptedException {

		int[] l1 = { 2, 4, 9 };
		int[] l2 = { 5, 6, 4, 9 };
		for (int element: addTwoNumbers(l1, l2)) {
			System.out.print(element + ", ");
			Thread.sleep(400);
		}

	}

	public static int[] addTwoNumbers(int[] l1, int[] l2) {
		String first = "";
		String second = "";
		for (int x = 0; x < l1.length; x++) 
			first += l1[x];
		for (int y = 0; y < l2.length; y++) 
			second += l2[y];
		int number1 = Integer.parseInt(first);
		int number2 = Integer.parseInt(second);
		
        String n1Str = Integer.toString(number1);
        String n2Str = Integer.toString(number2);
        StringBuilder rNumber1 = new StringBuilder(n1Str);
        StringBuilder rNumber2 = new StringBuilder(n2Str);
        rNumber1.reverse();
        rNumber2.reverse();
        int firstNumber = Integer.parseInt(rNumber1.toString());
        int secondNumber = Integer.parseInt(rNumber2.toString());
        
        String resultStr = Integer.toString(firstNumber + secondNumber);
        StringBuilder rResult = new StringBuilder(resultStr);
        rResult.reverse();
        int[] solution = new int[rResult.length()];
        for (int x =0; x < rResult.length(); x ++) {
        	solution[x] = Character.getNumericValue(rResult.charAt(x));
        }

        return solution;

	}

}