


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class hitler {

	private static final DecimalFormat decfor = new DecimalFormat("0.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the raw score: ");
		double rawScore = scanner.nextDouble();

		System.out.print("Enter the mean: ");
		double mean = scanner.nextDouble();

		System.out.print("Enter the standard deviation: ");
		double stdDeviation = scanner.nextDouble();

		// Calculate the z-score
		String zScoreSring = decfor.format((rawScore - mean) / stdDeviation);
		double zScore = Double.parseDouble(zScoreSring);

		// Calculate the area under the normal curve
		if (zScore < 0) {
			double area = (calculateArea(-zScore));
			System.out.println("Z-Score: " + zScore);
			System.out.printf("Area under the curve: %.4f", (area - 0.5));
			double percentage = (area - 0.5) * 100;
			System.out.printf("\nPercentage: %.2f", percentage);
			System.out.println("%");
		} else {
			double area = calculateArea(zScore);
			System.out.println("Z-Score: " + zScore);
			System.out.printf("Area under the curve: %.4f", (area - 0.5));
			double percentage = (area - 0.5) * 100;
			System.out.printf("\nPercentage: %.2f", percentage);
			System.out.println("%");
		}

	}

	public static double calculateArea(double zScore) {

		int neg = (zScore < 0d) ? 1 : 0;
		if (neg == 1)
			zScore *= -1d;

		double k = (1d / (1d + 0.2316419 * zScore));
		double y = ((((1.330274429 * k - 1.821255978) * k + 1.781477937) * k - 0.356563782) * k + 0.319381530) * k;
		y = 1.0 - 0.398942280401 * Math.exp(-0.5 * zScore * zScore) * y;

		return ((1d - neg) * y + neg * (1d - y) / 2);

	}

}

