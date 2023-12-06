
public class GenericMethods {

	public static void main(String[] args) {

		Integer[] iray = { 1, 2, 3, 4 };
		Character[] cray = { 'b', 'u', 'c', 'k', 'y' };
		String[] damn = {"tae", "hey"};

		printMe(iray);
		printMe(cray);
		printMe(damn);

	}

	// generic method <T> is just a name
	public static <kyle> void printMe(kyle[] x) {
		for (kyle b : x)
			System.out.printf("%s ", b);
		System.out.println();
	}
}
