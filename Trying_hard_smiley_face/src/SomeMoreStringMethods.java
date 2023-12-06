//Some More String Methods
public class SomeMoreStringMethods {

	public static void main(String[] args) {
		
		String s = "buckyrobertsbuckyroberts";
		/*
		 * searches for the first index of K
		 * the 5 skips the first five index (starting point, unnecessary)
		 */
		System.out.println(s.indexOf('k', 5));
		//rob starts at 5th index
		System.out.println(s.indexOf("rob"));
		
		System.out.println("");
		
		String a = "Duck ";
		String b = "     monster     ";
		//concatenation but it's not using +
		System.out.println(a.concat(b));
		//trim removes the spaces in the variable
		System.out.println(b.trim());
		//replaces all the capital D's with capital F
		System.out.println(a.replace('D', 'F'));
		String c = b.trim();
		//turns the phrase in the variable to upper case
		System.out.println(c.toUpperCase());
		//turns the first letter to upper case
		System.out.println(c.substring(0, 1).toUpperCase() + c.substring(1));
		
	}

}
