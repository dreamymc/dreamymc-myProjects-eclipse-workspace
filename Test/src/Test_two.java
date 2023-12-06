import java.util.*;

public class Test_two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the date in the same manner: 12/25/2002");
		String in = sc.nextLine();
		String[] ar = in.split("/");
		int month = Integer.parseInt(ar[0]);
		int day = Integer.parseInt(ar[1]);
		int year = Integer.parseInt(ar[2]);
		System.out.printf("%s %d, %d is on ", lunar(month - 1), day, year);
		ZellersGregorian(month, day, year);
	}
	
	public static String ZellersGregorian(int month, int day, int year) {
		int J = year / 100;
		int m = month;
		int q = day;
		int K = year % 100;
		if (m <= 2) {
			m = m + 12;
			K -= 1;
		}
		int h = (q + (13 * (m - 2) / 5) + K + (K / 4) - (K/100) + (K/400)) % 7;
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.print(days[ Math.abs(h)]);
		return days[ Math.abs(h)];

	}
	
	public static String lunar(int month) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months[month];
	}
}
