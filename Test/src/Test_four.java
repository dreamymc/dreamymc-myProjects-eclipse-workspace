import java.util.Scanner;

public class Test_four {

	public static void main(String[] args) {
		int score, items;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input total number of items: ");
		items = scan.nextInt();
		System.out.println("Passing score is " + passingScore(items));
		System.out.print("Please input score: ");
		score = scan.nextInt();
		if (score >= passingScore(items)) {
			System.out.printf("Congrats you passed manegga! You have %d mistakes.", (items - score));
		}else {
			System.out.printf("Sorry you failed. You need %.0f points to pass.", (passingScore(items) - score));
		}
	}

	public static double passingScore(int items) {
		double passing = items * 0.7;
		return passing;
	}
}
