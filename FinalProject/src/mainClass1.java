
import java.util.Scanner;

import javax.swing.*;

public class mainClass1 {

	static double totalHrsRendered, ratePerHr, salary;

	public static void Set_Rate(double rate) {

// This method will set the rate

		ratePerHr = rate;

	}

	public static void Hours_Worked(double hrs, int days) {

// This method will store hours rendered in an array

// 7 is the size of the array following 7 days/week.

		double[] hrsRendered = new double[7];

		hrsRendered[days - 1] = hrs;

		for (int i = 0; i < hrsRendered.length; i++) {

			totalHrsRendered = totalHrsRendered + hrsRendered[i];

		}

	}

	public static double Get_Salary() {

// Calculate total salary for 7 days.

		salary = (ratePerHr * totalHrsRendered) * 7;

		return salary;

	}

	public static void Set_Worker_Info(String name, String work) {

// Set worker's information

		System.out.println("Name: " + name + "\n"

				+ "Work: " + work);

	}

	public static void main(String[] args) {

// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int days = 1;

		double hrs, rate;

		String name, work;

		System.out.println("Enter your name: ");

		name = scan.nextLine();

		System.out.println("Enter your work: ");

		work = scan.nextLine();

		Set_Worker_Info(name, work);

		System.out.println("Enter your rate per hour: ");

		rate = scan.nextDouble();

		Set_Rate(rate);

		do {

			System.out.println("Enter your rendered hours for day " + days + ": ");

			hrs = scan.nextDouble();

			Hours_Worked(hrs, days);

			days++;

		} while (days < 8);

		System.out.println("Rate: " + rate);

		System.out.println("Total Number of hours rendered:" + totalHrsRendered);

		System.out.println("Salary: " + Get_Salary());

	}

}