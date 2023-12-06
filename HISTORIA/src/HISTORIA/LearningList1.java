package HISTORIA;

import java.util.*;

public class LearningList1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String[] empty = { "Nothing" };
			boolean flag = true;
			boolean contained = true;
			List<String> main_list = new ArrayList<>(Arrays.asList(empty));
			do {
				// print the list
				printlist(main_list);
				main_list.remove("Nothing");
				// add something to the list
				System.out.print("Add something to your list: ");
				String something = sc.nextLine();
				String[] split = something.split(" ");
				List<String> arraylist = new ArrayList<>(Arrays.asList(split));

				for (String x : arraylist) {
					if (main_list.contains(x)) {
						System.out.print(x +" ");
						contained = false;
					}
				}
				if (contained == false) {
					System.out.println("is already in the list!");
					contained = true;
				}
				System.out.print("You added: ");
				for(String y: arraylist) {
					System.out.println(y);
				}
				arraylist.removeAll(main_list);
				main_list.addAll(arraylist);
				System.out.println("[1] To continue the program.\n[2] To stop the program");
				String terminate = sc.nextLine();
				if (terminate.equals("1")) {
					flag = true;
				} else if (terminate.equals("2")) {
					flag = false;
					printlist(main_list);
				}
			} while (flag == true);
		}

	}

	public static void printlist(Collection<String> list) {
		System.out.println("Your list has: ");
		for (String l : list)
			System.out.println(l);
	}

}
