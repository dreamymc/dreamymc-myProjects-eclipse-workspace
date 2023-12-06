
//converting lists to arrays
import java.util.*;

public class ConvertingListsToArrays {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String[] stuff = { "babies", "watermelong", "melons", "fudge" };
			LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
			thelist.add("pumpkin");
			thelist.addFirst("firstthing");

			// convert the list back to an array
			stuff = thelist.toArray(new String[thelist.size()]);
			for (String a : stuff)
				System.out.print(a + " ");
		}

	}
}