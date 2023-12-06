
//recursion java is the technique of making a function call itself
import java.util.Scanner;

public class Recursion {
	static Scanner sc = new Scanner(System.in);

	// main
	public static void main(String[] args) {

		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		for (int i = n; i >= n; i--) {
			if (n <= 1) {
				System.out.print(fact(n));
				System.out.println(" is the factorial of " + n);
				break;

			} else
				System.out.print(n * fact(n - 1));
			System.out.println(" is the factorial of " + n);
			n--;
		}

	}

	// factorial
	public static long fact(long n) {
		if (n <= 1)
			return 1;
		else
			return n * fact(n - 1);
	}

}
