//linked list - tutorial six and seven
import java.util.*;
public class LinkedListProgram {

	public static void main(String[] args) {
		
		String [] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
		List<String> list1 = new LinkedList<String>();
		for (String x : things)
			list1.add(x);
		
		String [] things2 = {"sausage", "bacon", "goats", "harrypotter" };
		List<String> list2 = new LinkedList<String>();
		for (String y : things2)
			list2.add(y);
		
		
		printMe(list1);
		printMe(list2);
		//combines all to list1
		list1.addAll(list2);
		//removes all on list2
		list2 = null;
		System.out.println();
		
		printMe(list1);
		removeStuff(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);
	}

	//printMe method, prints all things inside the list
	private static void printMe (List<String> L) {
		for(String b : L)
			System.out.printf("%s ", b);
			System.out.println();	
	}

	//removeStuff method
	private static void removeStuff(List <String> L, int from, int to) {
		L.subList(from, to).clear();
	}
	
	//reverseMe
	private static void reverseMe(List<String> L) {
		ListIterator<String> it = L.listIterator(L.size());
		while(it.hasPrevious())
			System.out.printf("%s ", it.previous());
	}
}
