

public class GenericReturnTypes {

	public static void main(String[] args) {
		
		System.out.println(max(23, 42, 1));
		System.out.println(max("chicken", "apples", "tots"));

	}

	public static <Tite extends Comparable<Tite>> Tite max(Tite a, Tite b, Tite c) {
		Tite max = a;
		
		if(b.compareTo(a) > 0)
			max = b;
		
		if(c.compareTo(max) > 0)
			max = c;
		
		return max;
	}
}
