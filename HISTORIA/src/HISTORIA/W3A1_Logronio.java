package HISTORIA;

import java.util.Scanner;
import java.util.InputMismatchException;

public class W3A1_Logronio {

	public static void main(String[] args) throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Student name: ");
		String name = scan.nextLine();
		String[] yearLevel = { "First Year", "Second Year", "Third Year", "Fourth Year" };
		// year level can be added
		String[] subjects = { "Math", "Araling-panlipunan", "Mapeh", "English", "Science", "Values", "Filipino" };
		// subjects can be added
		int[][] grades = new int[1][subjects.length];
		System.out.println();
		for (int a = 0; a < grades.length; a++) {
			System.out.printf("-------%s-------\n", yearLevel[a]);
			for (int b = 0; b < grades[a].length; b++) {
				while (true) {
					try {
						System.out.printf("Enter grade for %s: ", subjects[b]);
						grades[a][b] = scan.nextInt();
						if (grades[a][b] < 50 || grades[a][b] > 100)
							throw new ArithmeticException("damn.");
						else
							break;
					} catch (ArithmeticException error) {
						System.out.printf("%s, please input grades between 50 to 100.\n", name);
					} catch (InputMismatchException damn) {
						System.out.printf("%s, please do not enter letters.\n", name);
						scan.nextLine();
					}
				}
			} // b(col) end here
		} // a(row) end here

		System.out.println();
		PrintGrades(yearLevel, subjects, grades);
		System.out.println("------Conclusion------\n");
		HighestGrade(yearLevel, grades, subjects);
		System.out.printf("%s's General Average is: %d", name, GeneralAverage(grades));

	} // diri

	static void HighestGrade(String[] yL, int[][] grade, String[] subj) {
		for (int M = 0; M < grade.length; M++) {
			String subject = "Math";
			int max = grade[M][0];
			for (int c = 0; c < grade[M].length; c++) {
				if (max < grade[M][c]) {
					subject = subj[c];
					max = grade[M][c];
					
				}
			}
			System.out.printf("Highest grade in %s is %d which is the subject %s.",yL[M], max, subject);
			System.out.println();
		}

	}

	static int GeneralAverage(int[][] grade) {
		int sum = 0;
		int average = 0;
		int year = 0;
		for (int row = 0; row < grade.length; row++)
			for (int col = 0; col < grade[row].length; col++) {
				sum += +grade[row][col];
				average = 7;
				year = row + 1;

			}
		int total = sum / average;
		return total / year;

	}

	static void PrintGrades(String[] yL, String[] s, int g[][]) {
		for (int row = 0; row < g.length; row++) {
			System.out.println(yL[row]);
			for (int col = 0; col < g[row].length; col++) {
				System.out.printf("%s: %d \n", s[col], g[row][col]);
			}
			System.out.println();
		}
	}
}