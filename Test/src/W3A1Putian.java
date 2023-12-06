import java.util.InputMismatchException;
import java.util.Scanner;

public class W3A1Putian {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] grades = new int[1][7];

		int max1st = Integer.MIN_VALUE;
		int max2nd = Integer.MIN_VALUE;
		int max3rd = Integer.MIN_VALUE;
		int max4th = Integer.MIN_VALUE;

		String[] subjects = { "English", "Mapeh", "ESP", "Filipino", "Math", "PE", "Science" };
		String[] yearlevel = { "\n7th Grade", "\n8th Grade", "\n9th Grade", "\n10th Grade" };

		for (int year1 = 0; year1 < grades.length; year1++) {
			System.out.println(yearlevel[year1]);
			for (int subject1 = 0; subject1 < grades[year1].length; subject1++) {
				while (true) {
					try {
						System.out.print(subjects[subject1] + ": ");
						grades[year1][subject1] = input.nextInt();
						if ((grades[year1][subject1] > 100) || (grades[year1][subject1] < 65))
							throw new ArithmeticException("Tens");
						else
							break;
					} catch (ArithmeticException a) {
						System.out.println("Enter grade above 65 and below 100.");
					}catch(InputMismatchException b) {
						System.out.println("Invalid input.");
						input.nextLine();
					}
				}
			}
		} // end of school year

		for (int year1 = 0; year1 < grades.length; year1++) {
			System.out.println(yearlevel[year1]);
			for (int subject1 = 0; subject1 < grades[year1].length; subject1++) {
				System.out.print(subjects[subject1] + ": ");
				System.out.println(grades[year1][subject1] + '\n');
			}
		}
		
		for (int subject1 = 0; subject1 < grades[0].length; subject1++) {
			for (int year1 = 0; year1 < grades.length; year1++) {
				if (year1 == 0) {
					if (grades[year1][subject1] > max1st) {
						max1st = grades[year1][subject1];
					}
				} else if (year1 == 1) {
					if (grades[year1][subject1] > max2nd) {
						max2nd = grades[year1][subject1];
					}
				} else if (year1 == 2) {
					if (grades[year1][subject1] > max3rd) {
						max3rd = grades[year1][subject1];
					}
				} else if (year1 == 3) {
					if (grades[year1][subject1] > max4th) {
						max4th = grades[year1][subject1];
					}
				}
			}
		}
		
		System.out.println("The highest value in the first column is " + max1st);
		System.out.println("The highest value in the second column is " + max2nd);
		System.out.println("The highest value in the third column is " + max3rd);
		System.out.println("The highest value in the fourth column is " + max4th);

	}
}