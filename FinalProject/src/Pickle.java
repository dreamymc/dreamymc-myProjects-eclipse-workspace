import java.util.Scanner;
public class Pickle {
	 
	public static double Addition(double num1, double num2) {
		double total = (num1 + num2);
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {1, 2, 3, 4, 5};

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
		    sum += array[i];
		    System.out.println(sum);
		}

		int average = sum / array.length;

		String averageString = Integer.toString(average);
		int averageInt = Integer.parseInt(averageString);


		

	}
	
	}

