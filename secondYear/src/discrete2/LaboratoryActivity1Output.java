package discrete2;

import java.util.Scanner;

public class LaboratoryActivity1Output {

	public static void main(String[] args) {
//		Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34,
//		55, .... The first two numbers of the sequence are both 1, while each
//		succeeding number is the sum of the two numbers before it. Write a computer
//		program that calculates the nth Fibonacci number. 

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number for the nth Fibonacci number: ");
		int nth = scan.nextInt();
		int firstTerm = 0;
		int secondTerm = 1;
		for (int i = 0; i <= nth; i++) {
			System.out.print(firstTerm + ", ");
			int result = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = result;

		}
		System.out.println("\n");
//		Write a program to calculate the sum: 1 1 1 1
//		2 3 Terms
//		+ + + ⋅⋅⋅+ where Terms is
//		specified by the user. This sum is called Harmonic series. 

		System.out.print("Enter the number of terms for the sum of harmonic series: ");
		int terms = scan.nextInt();

		if (terms <= 0) {
			System.out.println("Number of terms must be a positive integer.");
		} else {
			double sum = 0.0;
			for (int i = 1; i <= terms; i++) {
				sum += 1.0 / i;
				System.out.printf("%.2f, ", sum);
			}
			System.out.printf("The sum of the Harmonic series with %d terms is: %.4f%n", terms, sum);
		}
		System.out.println();

//        Write a program to calculate the sum of numbers from 1 to n using recursion. 

		System.out.print("Enter a number to calculate the sun of 1 to n: ");
		int n = scan.nextInt();
		System.out.println(fact(n));
		System.out.println();

//        Write a program to find the Greatest Common Divisor (GCD) of two
//        numbers using recursion. 

		System.out.print("Enter input 1 for the GCD: ");
		int input1 = scan.nextInt();
		System.out.print("Enter input 2 : ");
		int input2 = scan.nextInt();

		int result = gcd(input1, input2);
		System.out.printf("The GCD of %d and %d is %d. \n", input1, input2, result);

//		The numbers in Hailstone sequence bounce up and down. It starts with any
//		positive integer (an initial seed) and obtain a sequence of numbers by
//		following these rules.
//		1. If the current number is even, divide it by two; else if it is odd, multiply
//		it by three and add one.
//		2. Repeat. 

		System.out.print("Enter a number for the Hailstone sequence: ");
		int hail = scan.nextInt();

		while (hail != 1) {
			if (hail % 2 == 0) {
				hail = hail / 2;
			} else {
				hail = hail * 3 + 1;
			}
			System.out.println(hail);
			try {
				Thread.sleep(300);
			} catch (Exception e) {

			}
		}
	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	static int fact(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n + fact(n - 1);
		}
	}

}
