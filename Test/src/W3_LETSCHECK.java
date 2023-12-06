
public class W3_LETSCHECK {

	public static double secret(int first, double second)

	{

		double temp;

		if (second > first)

			temp = first * second;

		else

			temp = first - second;

		return temp;

	}

	public static void main(String[] args) {

		int x = 27;

		int y = 0;

		do {
			x = x / 3;
			System.out.println(x);
		}
		while (x >= y);
	}

}
