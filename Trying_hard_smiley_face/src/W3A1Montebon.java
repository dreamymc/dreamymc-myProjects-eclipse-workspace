import java.util.*;

public class W3A1Montebon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int y = 0;
		double[][] grades = new double[4][7];
		boolean flag = false;

//		try {
		String[] subjects = { "Math", "English", "Science", "Filipino", "Araling Panlipunan",
				"Edukasyon sa Pagpapakatao", "MAPEH" };

		for (int x = 0; x < grades.length; x++) {
			System.out.println("======== " + (x + 7) + "th GRADE ========");

			for (int i = 0; i < grades[x].length; i++) {
				do {
					try {
						System.out.print(subjects[i] + ": ");
						grades[x][i] = input.nextDouble();
						if (grades[x][i] < 60 || grades[x][i] > 100) {
							throw new ArithmeticException("\nThe minimum grade is 60 and the maximum grade is 100.\n");
						} else {
							break;
						}

					} catch (ArithmeticException e) {
						System.out.println("\nThe minimum grade is 60 and the maximum grade is 100.\n");
					} catch (InputMismatchException f) {
						System.out.println("\nInvalid input.\n");
						input.next();

					}

				} while (true);
			}
			System.out.println();
		}

		display(grades);
		System.out.println();
		average(grades);
		System.out.println();
		highestValue(grades);
//		} catch (Exception e) {
//			System.out.println("Invalid output");
//		}
	}

	public static void display(double[][] grades) {
		for (int x = 0; x < grades.length; x++) {
			int gradeLevel = x + 7;
			if (gradeLevel > 9) {
				System.out.print("Grade: " + gradeLevel + "| ");
			} else {
				System.out.print("Grade: " + gradeLevel + " | ");
			}

			for (int i = 0; i < grades[x].length; i++) {
				
				System.out.print(grades[x][i] + " | ");

			}
			System.out.println();
		}

	}

	public static void average(double[][] grades) {
		double sum;
		for (int r = 0; r < grades.length; r++) {
			sum = 0.0;
			for (int c = 0; c < grades[r].length; c++) {
				sum = sum + grades[r][c];
			}
			double average = sum / 7;
			int yearLevel = r + 7;
			System.out.printf("Total Average in Grade %d: %.2f", yearLevel, average);
			System.out.println("%");
		}
	}

	public static void highestValue(double[][] grades) {
		double max;
		for (int r = 0; r < grades.length; r++) {
			max = grades[r][0];
			for (int c = 0; c < grades[r].length; c++) {
				if (max < grades[r][c]) {
					max = grades[r][c];
				}
			}
			int yearLevel = r + 7;
			System.out.printf("Highest grade in Grade %d: %.2f", yearLevel, max);
			System.out.println("%");
		}
	}

}
